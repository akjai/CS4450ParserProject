# CS4450ParserProject

Team members: Ankit Jain, Sam Spell, James Tipton, Thadeus Meneses, Austin Neumann

This project is a parser for the Python programming language. It will create a parse tree for statements that match Python code. 

Project Requirements: 
In order to run this project, you need to have Java and Antlr4 installed on your device, and the antlr4 library downloaded using:
pip install antlr4-python3-runtime

How to Use/Run the parser (Mac OS):
1: Download antlr4 version 4.9.2 from https://www.antlr.org/download.html
2: Download latest version of Java for your device.
3: Run following commands in terminal:
  - sudo cp antlr-4.9.2-complete.jar /usr/local/lib/
  - export CLASSPATH=".:/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH"
  - alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
  - alias grun='java -Xmx500M -cp "/usr/local/lib/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'
4: Clone the repo into your local directory.
  - git clone https://github.com/akjai/CS4450ParserProject.git
5: In the project folder, run the following commands:
  - antlr4 ParserProject.g4
  - javac ParserProject*.java
  - grun ParserProject \<RULE\> -tree or grun ParserProject \<RULE\>  -gui
  
All in one line: antlr4 ParserProject.g4; javac ParserProject*.java; grun ParserProject \<RULE\>  -gui

How to Use/Run the parser (Windows):
1: Download antlr4 version 4.11.1 (or other version) from https://www.antlr.org/download.html
2: Download latest version of Java for your device.
3: Add the antlr-4.11.1-complete.jar to the CLASSPATH by pressing win+R, typing in sysdm.cpl, opening System Properties, going to Environment variables, and creating/appending to the CLASSPATH.
5: Create two batch files in system PATH, "antlr4.bat" and "grun.bat".
6: Clone the repo into your local directory.
  - git clone https://github.com/akjai/CS4450ParserProject.git
7: In the project folder, run the following commands:
  - antlr4 ParserProject.g4
  - javac ParserProject*.java
  - grun ParserProject \<RULE\> -tree or grun ParserProject \<RULE\>  -gui
  
  
Demonstration Link: https://drive.google.com/drive/folders/1TJAdr9pvIMpG0JeTkA3A7tajjcXWj_hr?usp=sharing
