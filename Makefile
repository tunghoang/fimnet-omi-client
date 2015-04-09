.PHONY: all clean edit jar compile wsimport

all: jar
wsimport:
	wsimport -keep -s src/ -d out http://localhost:45678/AdminMgmt.wsdl
	wsimport -keep -s src/ -d out http://localhost:45678/AdminMgmt.wsdl
	wsimport -keep -s src/ -d out http://localhost:45678/ConfigurationMgmt.wsdl
	wsimport -keep -s src/ -d out http://localhost:45678/ContentMgmt.wsdl
	wsimport -keep -s src/ -d out http://localhost:45678/DeviceMgmt.wsdl
	wsimport -keep -s src/ -d out http://localhost:45678/DomainMgmt.wsdl
	wsimport -keep -s src/ -d out -b EntitlementBindings.xml http://localhost:45678/EntitlementMgmt.wsdl

compile:
	javac -cp .out:libs/* -sourcepath src -d out src/vn/fimnet/CommandLineOMIClient.java

jar: compile
	jar cf fimnet.jar -C out/ .
clean:
	rm -fr out/vn/ fimnet.jar
edit:
	vim -p src/vn/fimnet/*.java
