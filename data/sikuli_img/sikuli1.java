/**
 * 
 */
package demo;

import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import org.sikuli.api.*;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;
import org.testng.annotations.Test;

import io.sterodium.extensions.node.rmi.TargetFactory;

import org.sikuli.api.robot.Key;
import org.sikuli.api.robot.Keyboard;

/**
 * @author dmhuy
 *
 */
public class sikuli1 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Exception 
	 */
		@Test
		public void demoSikuli() throws Exception {
		Mouse mouse = new DesktopMouse();
		Keyboard keyboard = new DesktopKeyboard();
		String workingDir = System.getProperty("user.dir") + File.separator + "data" + File.separator + "sikuli_img" + File.separator;
		
		System.out.println("HEREREREE: " + (System.getProperty("java.library.path")));
		
		TargetFactory targetFactory = new TargetFactory();
		ScreenRegion s = new DesktopScreenRegion();	
		File img1 = new File(workingDir + "SO_icon.png");
		
		ImageTarget SO_icon_img = new ImageTarget(img1);
		//ImageTarget SO_icon_img = targetFactory.createImageTarget(workingDir + "SO_icon.png");
		System.out.println("FILE: " + workingDir + "SO_icon.png");
		ScreenRegion SO_icon = s.find(SO_icon_img);
		mouse.click(SO_icon.getCenter());
		Thread.sleep(10000);
		
		ImageTarget userName_img = targetFactory.createImageTarget(workingDir + "UserName.png");
		ScreenRegion username = s.find(userName_img);
		mouse.click(username.getCenter());
		keyboard.type("abc@123.com");
		
		ImageTarget password_img = targetFactory.createImageTarget(workingDir + "Password.png");
		ScreenRegion password = s.find(password_img);
		mouse.click(password.getCenter());
		keyboard.type("12345678");
		
		ImageTarget goButton_img = targetFactory.createImageTarget(workingDir + "Go_Button.png");
		ScreenRegion goButton = s.find(goButton_img);
		mouse.click(goButton.getCenter());
		}
	}


