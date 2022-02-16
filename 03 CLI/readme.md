Since the syntax for the windows commandline instruction sare always the same, i will only show some basic windows command instructions and then show how to execute them with Python, Java and Javascript.


#### Windows Commands

<pre>
<b> echo TXT </b>           
<b> ipconfig </b>           
<b> systeminfo</b>
<b> dir </b>                
<b> ping TARGET </b>        -t AMOUNT, > textfile.txt
<b> shutdown </b>           -s: local machine, -t: timer, -r: restart, -l:log off, -a: cancel
<b> tasklist</b>            '/fi "MEMUSAGE gt 100000"; '/fi "IMAGENAME eq chrome.exe"' (QUOTES!)
<b> taskkill</b>            '/IM spotify.exe /f'
</pre>

#### Python

<pre>
<b> import subprocess </b>
<b> subprocess.run("ipconfig") </b>                         runs given command and prints output
<b> subprocess.run("dir", shell = True </b>                 shell = True necessary for some commands
<b> subprocess.check_output("ipconfig", errors="ignore")    returns cmd output as string, ignore errors to get correct lines


-> use regex to catch output
</pre>


#### JavaScript

<pre>
var process = require("child_process");

process.exec("ipconfig", (err, stdout, stderr) => {
    console.log(stdout)
})
</pre>

#### Java

<pre>
Process process = Runtime.getRuntime().exec("ipconfig");
BufferedReader output = new BufferedReader(new InputStreamReader(process.getInputStream()));

while (output.readLine() != null) {
        System.out.println(output.readLine);
}
output.close()


-> needs try / catch expection

</pre>
