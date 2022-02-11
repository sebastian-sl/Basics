## Basics to create virtual enviroment

* with command-line cd to the directory where you want to create the project in
* python -m venv <name>
* cd to newly-created-folder/Scripts and run activate.bat (you are now inside the venv)
* cd back to project directory (cd ..)
* install all needed packages by pip install <module>
* pip freeze > requirements.txt (to save all packages with versions)


* **cd to path** where you want to create the enviroment/project in
* **python -m venv NAME**
* **cd to new-folder/Scripts and run activate.bat** you are not inside the venv
* **cd back to root directory**
* **pip install MODULE** to install all needed packages
* **pip freeze > requirements.txt** to save all packages with versions  

* **pip install -r requirements.txt** to install all packages from file (if you take over a project for example)