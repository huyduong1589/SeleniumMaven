package cli;
import static core.matcher.Matchers.contains;
import static net.schmizz.sshj.connection.channel.direct.Session.Shell;

import java.awt.Container;
import java.io.IOException;
import java.security.PublicKey;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.transport.verification.HostKeyVerifier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpATTRS;

import automation.utils.network.SSHwrapper;
import core.Expect;

public class demoCLI {
	
	public static final Logger logger = LogManager.getLogger("Demo CLI");

    @Test
    public void democli() throws IOException, InterruptedException, JSchException{ 
        System.out.println("Establishing Connection...TEST");
        String user = "user";
        String password = "pass";
        String host = "10.10.10.10";
        int port=22;
        SSHwrapper test = new SSHwrapper(host, port, user, password);
        test.connect();
        Thread.sleep(1500);
        Expect session = test.interaction();
        Thread.sleep(1500);
        session.sendLine("pwd");
        session.expect(contains("root"));
        session.sendLine("cd /etc");
        session.sendLine("ls");
        session.expect(contains("console"));
        Thread.sleep(5000);
        test.disconnect();
    }
}
