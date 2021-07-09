# myBackendProject
 REST microservice that list the languages used by the 100 trending public repos on GitHub for the past 30 days, with the number of usage and the id of repositories using the language.
The response to our endpoint GET	/repositories/languages/

{“Languages_trending_repos” : [{
“language”: String, 
  	“number_of_usage”: integer,
“repos”: [ integer ]
}]
}

# Technologies:

SpringBoot
JUnit5

# ScreenShot :

![image](https://user-images.githubusercontent.com/85487855/125093154-58a69c00-e0d2-11eb-986d-2abe19d8de81.png)
