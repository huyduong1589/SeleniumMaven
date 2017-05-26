package automation.utils.network;

import static net.schmizz.sshj.connection.channel.direct.Session.Shell;
import static core.filter.Filters.removeColors;
import static core.filter.Filters.removeNonPrintable;
import static core.matcher.Matchers.contains;
import static core.matcher.Matchers.regexp;
/*import static net.sf.expectit.filter.Filters.removeColors;
import static net.sf.expectit.filter.Filters.removeNonPrintable;
import static net.sf.expectit.matcher.Matchers.contains;
import static net.sf.expectit.matcher.Matchers.regexp;*/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.PublicKey;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.transport.verification.HostKeyVerifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import core.Expect;
import core.ExpectBuilder;

public class SSHwrapper {
    private String username;
    private String hostname;
    private int port;
    private String password;
    private Session session;
    private Expect expect;
    private Channel channel;

    public static final Logger logger = LogManager.getLogger("SSHwrapper");

    public SSHwrapper(String hostname, int port, String username, String password) {
        this.username = username;
        this.hostname = hostname;
        this.password = password;
        this.port = port;
    }

    public void connect() throws IOException, JSchException {
        
        JSch jsch = new JSch();
        session = jsch.getSession(username, hostname, port);
        session.setPassword(password);
        session.setConfig("StrictHostKeyChecking", "no");
        System.out.println("Establishing Connection...");
        session.connect();
        channel = session.openChannel("shell");
        channel.connect();
        expect = new ExpectBuilder()
                .withOutput(channel.getOutputStream())
                .withInputs(channel.getInputStream(), channel.getExtInputStream())
                .withEchoInput(System.out)
                .withEchoOutput(System.err)
                .withInputFilters(removeColors(), removeNonPrintable())
                .withExceptionOnFailure()
                .build();
   }

    public void disconnect() {
        try {
            expect.close();
            channel.disconnect();
            session.disconnect();
        } catch (Exception e) {
            logger.error("Can not access host!!! " + e);
        }

    }
    
    public void send(String str) throws IOException{
        expect.send(str);
    }
    
    public void sendLine(String str) throws IOException{
        expect.sendLine(str);
    }
       
    public Expect interaction(){
        return this.expect;
    }
    
    public ChannelSftp buildSFTP() throws JSchException{
        ChannelSftp sftpChannel = (ChannelSftp) session.openChannel("sftp");
        sftpChannel.connect();
        return sftpChannel;
    }
}  
