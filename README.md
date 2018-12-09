# NBA-Accreditition-Report-Generation

https://websiteforstudents.com/how-to-install-eclipse-oxygen-ide-on-ubuntu-167-04-17-10-18-04/
## Step 1: Install Java JDK8
sudo add-apt-repository ppa:webupd8team/java
sudo apt update
sudo apt install oracle-java8-installer
## Step 2: Download Eclipse Oxygen
Now that Java JDK 8 is installed, got and download Eclipse Oxygen IDE package for your systems.. the link below can be used to get it.

https://www.eclipse.org/downloads/

## Step 3: Install Eclipse IDE

Use the commands below to extract the content in the  ~/Downloads folder… The next line launches the installer…

tar xfz ~/Downloads/eclipse-inst-linux64.tar.gz
~/Downloads/eclipse-installer/eclipse-inst

for the packages you need to install to have eclipse IDE for java EE developers 
Use the onscreen instructions to complete the installer.. Accept the default installation directory and continue

Right click on project
build path
Add external archives


https://dev.mysql.com/downloads/connector/j/
platform independent

mysql-connector-java-8.0.13.zip
Download Link: https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java-8.0.13.zip


Step 1 – Java Installation

You must have Java installed on the system before installing Apache Tomcat on a Linux VPS. Tomcat 9 required Java 8 or later version to work. You can check and verify that Java is installed with the right version.

java -version

java version "1.8.0_144"
Java(TM) SE Runtime Environment (build 1.8.0_144-b01)
Java HotSpot(TM) 64-Bit Server VM (build 25.144-b01, mixed mode)

If you don’t have Java installed on your system or installed a lower version, run below commands to satisfy requirements.

sudo apt-get update
sudo apt-get install default-jdk

## Step1
Download Tomcat From here: http://mirrors.estointernet.in/apache/tomcat/tomcat-7/v7.0.92/bin/apache-tomcat-7.0.92.tar.gz
## Step2
Extract the tar file
## Step3
Now make a directory at usr/local/tomcat
sudo mkdir /usr/local/tomcat
## Step4
move the extracted file to the directory
sudo mv apache-tomcat-7.0.92 /usr/local/tomcat
## Step5
Move to that directory
cd /usr/local/tomcat
cd /usr/local/tomcat/apache-tomcat-7.0.92
## Step6
Run these commands
sudo ln -s /var/lib/tomcat7/conf conf
sudo ln -s /tc/tomcat7/policy.d/03catalina.policy/conf/catalina.policy
sudo ln -s /var/log/tomcat7 log
sudo chmod -R 777 /usr/local/tomcat/apache*/conf

## Step7 Configuring the Server
###### 1 
From the Eclipse main menu choose File > New > Other...
###### 2
Select Server > Server.
###### 3
Click Next. 
###### 4
Select Tomcat vx.x Server
###### 5
Click Next. 
###### 6
Browse to the folder of your Tomcat installation.
(or type /usr/local/tomcat/apace-tomcat-7.0.92)
###### 7
Select Finish.

Refference
https://www.youtube.com/watch?v=D0OfTZuIDcs
https://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.stardust.docs.wst%2Fhtml%2Fwst-integration%2Fconfiguration.html

