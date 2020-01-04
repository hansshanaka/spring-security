# spring-security
Adding spring security to spring boot project(POC) 

Create Spring boot project
Add Spring Security dependency 
Run application 
You will get login form, but it has proper sign in validation you can’t login random credentials.
-	There is a mandatory authentication for all URLs (without configuration)
-	Spring security provides /error page
-	Add login form
-	Handel errors 
-	Above spring boot behaviors handle by filters(Spring boot default configuration)
How to find default user name and password:
	- Default User Name : user
To find the password check console log it shows as follows
-Using generated security password: ded16217-e294-40ab-ab75-893f6a578478 

Create own user name and password
Add following to application.properties 
spring.security.user.name=admin
spring.security.user.password=admin



