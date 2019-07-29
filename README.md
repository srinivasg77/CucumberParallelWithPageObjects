### CucumberParallelWithPageObjects

1. Go to the unzip file and import the project using the maven build.
2. This is designed by page object model with BDD approach ( Tools like Selenium, TestNG, Cucumber, Extent Report and Selenium Gird).
3. All dependency are added into the POM.xml file.
4. create a basesteps and base configuration of extent report which are located the pageobjects of the src/main/java  in the project structure.
5. Create feature file and convert into step definitions which are located the steps of the src/test/java in the project structure.
6. Create Page objects which are located the pageobjects of the src/main/java  in the project structure.
7. create runner files which are located the runners of  the src/test/java folder  in the project structure.
6. under the resources of test folder are executable, features files, grid configuration, logs, properties, testNG.xml file.
7. run the testng.xml file and will start executions and after complete the execution will generate the extent report in reports folder.
