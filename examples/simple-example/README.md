<div id="top"></div>

## Simple Example

*This simple example project demonstrates the use of miranum-core. Here we have created a fairly simple process that is
automated using
miranum-connect-core. The project consists of three modules:*

- [simple-example_camunda-7](simple-example-camunda-7)
- [simple-example_camunda-8](simple-example-camunda-8)
- [simple-example-core](simple-example-core)

*The application and domain logic is implemented in the `simple-example-core` project. It contains the services that are
called by a workflow engine.*
*The process is modelled using the open standard bpmn.*
*The following figure shows the process that is automated in the project:*

<div align="center">
   <img src="../../images/simple-example-bpmn.png" alt="simple-example-bpmn">
</div>

<p align="right">(<a href="#top">back to top</a>)</p>

### Getting Started

1. Run this commands to start a `camunda-7` workflow engine running inside a docker container:
    ```shell
    cd ../../stack/camunda-7/
    docker-compose up -d
    ```

2. Start the
   application [ExampleC7Application.java](simple-example-camunda-7/src/main/java/io/miragon/miranum/integrations/example/c7/ExampleC7Application.java)

3. Open [message-c7.bpmn](simple-example-camunda-7/src/main/resources/bpmn/message-c7.bpmn) in the `Camunda modeler`.

4. Deploy diagram

Now you can simply start the process instance and view the log in the application console.

> *_Note_* The same procedure applies to the Camunda8 example.

<p align="right">(<a href="#top">back to top</a>)</p>

### Generate element templates

This example also demonstrates how you can make use of the miranum element-templates generation feature
which lets you generate element templates for your worker definitions. \
To use the element template generation you have to add the @GenerateElementTemplates annotation to the method of your
Miranum worker.

To be able to use this annotation you have to add the miranum-core dependency or just the element-template-api
dependency to your maven project.

```xml

<dependency>
    <groupId>io.miragon.miranum</groupId>
    <artifactId>element-template-api</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

Some properties are required when using the @GenerateElementTemplate annotation:

```java
@Worker(type = "sendMessage")
@GenerateElementTemplate(name = "Send Message",
        id = "send-message",
        type = "sendMessage",
        appliesTo = {BPMNElementType.BPMN_SERVICE_TASK},
        version = "0-1")
public Answer sendMessage(final SendMessageCommand message) {
    return new Answer("answer to: " + message.getName());
}
```

Additionally, when deciding for which Workflow-Engine you are going to build your project for you have to add the
concrete
dependency of the element-templates generator to your maven project.

Camunda Platform 7:

```xml

<dependency>
    <groupId>io.miragon.miranum</groupId>
    <artifactId>element-templates-c7</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

Camunda Platform 8:

```xml

<dependency>
    <groupId>io.miragon.miranum</groupId>
    <artifactId>element-templates-c8</artifactId>
    <version>0.1.0-SNAPSHOT</version>
</dependency>
```

To further customize the generated element templates you can add the @ElementTemplateProperty annotation to the input
and output parameter of your worker definition. \
For example we can change the name, type and constraints on the properties of the SendMessageCommand:

```java
class SendMessageCommand
{
    @ElementTemplateProperty(name = "Message", type = "String", required = true)
    private String name;

    @ElementTemplateProperty(name = "Correlation Key", type = "String", required = true)
    private String key;
}
```

The element templates are then generated on startup of the main project. \
Currently they are stored in the `classes/element-templates` directory inside the `target` folder of the main project.

*To use element templates in the Camunda Modeler, please refer to
the [camunda documentation](https://docs.camunda.io/docs/components/modeler/desktop-modeler/element-templates/about-templates/).*

<p align="right">(<a href="#top">back to top</a>)</p>
