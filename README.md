# SOAP-Web-Service-Projects
[![Build Status](https://travis-ci.org/tanmoy281/SOAP-Web-Service-Projects.svg?branch=master)](https://travis-ci.org/tanmoy281/SOAP-Web-Service-Projects)

This repository contains SOAP Web Service and Client Projects Built with Apache CXF ,Spring ,gradle and Eclipse.

(read this: https://guides.github.com/introduction/flow/)

This repository contains two web projects
1.SimpleApacheCXFService
2.SimpleApacheCXFClientWebApp

These will create war build artifacts when these will be built by gradle.

Apart from those, this repository contains another two java projects
1.AddtionPojoService -- this is a pojo service which may contain Dao to interact with db.
2.SimpleApacheCXFContract -- this is a soap web service's contract project.

These will create jar build artifacts which will be required by the SimpleApacheCXFService web project

SimpleApacheCXFClientWebApp is a spring MVC web application which accepts http request from browser and internally calls a soap( over http) web service to perform the requested operations.
SimpleApacheCXFService is a spring Web application( not spring mvc web app) which uses apache cxf framework to implement jax-ws soap web service api. it accepts soap over http requests.

Here SimpleApacheCXFClientWebApp application interacts with SimpleApacheCXFService application. But SimpleApacheCXFService is loosely coupled application. you can create your own soap client application to interact with this application.


These two war files can be deplayed in same host or different host.
