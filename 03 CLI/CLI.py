import subprocess
import re

# BASICS
subprocess.run("ipconfig")                              # runs given command and prints output
subprocess.run("dir", shell=True)                       # shell=True necessary for some cmds (like dir/echo)
subprocess.check_output("ipconfig", errors="ignore")    # returns the cmd output as string (errors=ignore to get correct lines)

# IP CONFIG
result = subprocess.check_output("ipconfig", errors="ignore")
line = re.search('IPv4-Adresse(.*)', result).group()                # catches the line of the IPv4 address (group for string)
ip = re.search("\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3}$", line).group()    # catches just the IPv4 by pattern

# PING
result = subprocess.check_output("ping google.de", errors="ignore")
pings = re.findall('Zeit=(.*)ms', result)                           # catches all matches in a list (as strings)
pings = [int(p) for p in pings]                                     # converting to int

# SHUTDOWN
subprocess.run("shutdown -s -t 60")               # -s for local machine, -t is a timer
subprocess.run("shutdown -r", )                   # -r for restart
subprocess.run("shutdown -l")                     # -l to log off user
subprocess.run("shutdown -a")                     # -a to cancel the shutdown action

# SYSTEMINFO
result = subprocess.check_output("systeminfo", errors="ignore")
line = re.search("Betriebssystemname:(.*)", result).group(1)         # catches the line of the os
win = line.strip()                                                   # strip to remove whitespaces

# TASKS
subprocess.run("tasklist")                                    # lists all tasks running
subprocess.run('tasklist /fi "MEMUSAGE gt 100000"')           # lists all tasks filtered by memusage > 100 mb (quotes!)
subprocess.run('tasklist /fi "imagename eq chrome.exe"')      # lists all tasks filtered by taskname (quotes!)

subprocess.run('taskkill /IM spotify.exe /f')                  # kills a task by name
