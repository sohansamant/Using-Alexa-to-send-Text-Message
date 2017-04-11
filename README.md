﻿# Using-Alexa-to-send-Text-Message
First create a Twilio account and then you can get a free phone number for your country. Make sure the phone number you get at Twilio supports sms.
In your Twilio account settings, you need to find out the account session Id and authentification token. You will need them in the next stage when creating your AWS lambda function.
If you don't already have one, get an Amazon AWS account (free).
From the AWS Console (https://aws.amazon.com), you need to create a Lambda function wich will execute the code that will send the sms text decoded from speach to the sms gateway.
Give the lambda function a name and a default operating role. You can name it anything but make sure you remember the name and the role.
Paste the code from the file -  found in this repository in the Lamba funtion on AWS. Make sure you fill in your Twilio credentials in this lambda function, namely your session id and auth token.
At the top left corner there will be an ARN, save the ARN id of your lambda function, you will need it in the next stage when creating an Alexa skill.
You need to create a new Alexa skill from https://developer.amazon.com/edw/home.html#/skills/list using the Alexa Skill Kit (ASK)
Give the skill a name, I chose "Asksms" and choose the endpoint to be your previously implemented lambda function. Paste in your ARN id.
In the interaction model, type in the intent schema presented in interactionModel_intentSchema.json in this repository.
In the Sample Utterances fill in the content of sampleUtterances.txt
You can Skip Test and Publishing information for now. Your skill should be ready.
Testing- 
Just say something to like from the uttrance text file and Alexa should respond by sending a text message on the registered number.
