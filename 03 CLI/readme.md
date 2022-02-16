## Basic Windows CLI
Will only show some basic windows commands, because for the most of it there are better third party libraries/packages that can do the tasks better and/or easier.
Therefor i will only show basic commands and a short way to execute them into the given languages.

#### Windows Commands
* echo              
* ipconfig          
* dir               
* ping TARGET       -t AMOUNT, > outputfile.txt
* shutdown          -s: local machine, -t: timer, -r: restart, -l: log off user, -a:cancel shutdown
* systeminfo        
* tasklist          '/fi "MEMUSAGE gt 100000" (> 100mb)', '/fi "IMAGENAME eq chrome.exe" (taskname)'     (QUOTES!)
* taskkill          '/IM spotify.exe /f' 


#### Python
import subprocess

subprocess.run("ipconfig")                              runs given command and prints output
subprocess.run("dir", shell=True)                       shell=True necessary for some commands
subprocess.check_output("ipconfig", errors="ignore")    returns the cmd output as string, errors=ignore to get correct lines

-> use regex to catch output if necessary

#### Java
Process process = Runtime.getRuntime().exec("ipconfig");
BufferedReader output = new BufferedReader(new InputStreamReader(process.getInputStream()));
String outputLine;

while ((outputLine = output.readLine()) != null) {
  System.out.println(outputLine);
 }
 
 output.close()
