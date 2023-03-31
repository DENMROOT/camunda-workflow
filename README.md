# 1. Build and Run

 Start database and Camunda platform in docker environment
```#!bash
$ cd docker
$ docker-compose up
```

 Start SpringBoot app
```#!bash
$ ./gradlew build
$ ./gradlew bootRun
```

# 2. Workflow setup
 Install Camunda Modeller https://camunda.com/platform/modeler/
 Design required workflow *.bpmn file
 Put *.bpmn file with workflow to resources dir of ApringBoot app
 Start SpringBoot app

# 3. Start Workflow from SpringBoot app

 Get workflow Process id using Camunda Cockpit frontend http://localhost:9001/camunda-workflow
 paste <Process_id> in to script, and create a running  instance of workflow  

```#!bash
curl -d '{"variables":{"aVariable" : {"value" : "aStringValue", "type": "String"}},"businessKey" : "myBusinessKey"}' -H 'Content-Type: application/json' -X POST localhost:9001/camunda-workflow/engine-rest/process-definition/<Process_id>/start
```

http://localhost:8080/camunda/ - Camunda platform access
demo 
demo
