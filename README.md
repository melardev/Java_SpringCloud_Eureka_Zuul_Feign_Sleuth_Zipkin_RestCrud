# Table of Contents
- [Table of Contents](#table-of-contents)
- [Introduction](#introduction)
- [Full-stack Applications](#full-stack-applications)
  - [E-commerce (shopping cart)](#e-commerce-shopping-cart)
    - [Server side implementations](#server-side-implementations)
    - [Client side implementations](#client-side-implementations)
  - [Blog/CMS](#blogcms)
    - [Server side implementations](#server-side-implementations-1)
    - [Client side](#client-side)
      - [The next come are](#the-next-come-are)
  - [Simple CRUD(Create, Read, Update, Delete)](#simple-crudcreate-read-update-delete)
    - [Server side implementations](#server-side-implementations-2)
    - [Client side implementations](#client-side-implementations-1)
      - [The next come are](#the-next-come-are-1)
  - [CRUD + Pagination](#crud--pagination)
    - [Server side implementations](#server-side-implementations-3)
      - [The next come are](#the-next-come-are-2)
    - [Client side implementations](#client-side-implementations-2)
      - [The next come are](#the-next-come-are-3)
- [Social media links](#social-media-links)
- [Commands used to build the project](#commands-used-to-build-the-project)
- [Follow me](#follow-me)
    
# Introduction
This microservices app is composed of Eureka Zuul Api Gateway, Rest Api, and a Proxy service based on Feign Client.
All of them are Zipkin clients as well so they provide sleuth generated data to a Zipkin Server which you must have
running at localhost:9411(download the [zipkin.jar](https://zipkin.io/pages/quickstart.html) 
from the official website and run it with `javar -jar zipkin.jar`)

All requests go through Zuul, you either reach the Rest API with localhost:8080/api/todos or, reach the Rest API through
the proxy micro service which is using Feign with: localhost:8080/proxy/todos, all the variant URLs for CRUD follow the same
rule.

The zipkin-service at this moment in time should be skipt, it was a try on running an embedded zipkin server but, it does
not work, I don't why, if you know the reason please let me know. For a zipkin server, as said before, you need to download the jar
and run it. You will have the trace visualization on http://localhost:9411 by default, this is where zipkin server exposes its UI. 


# Full-stack Applications
## Simple Crud
### Server side implementations
- [Python Django + Rest Framework](https://github.com/melardev/DjangoRestFrameworkCrud)
- [Python Django](https://github.com/melardev/DjanogApiCrud)
- [Python Flask](https://github.com/melardev/FlaskApiCrud)
- [Asp.Net Core](https://github.com/melardev/AspNetCoreApiCrud)
- [Asp.Net Core + MediatR](https://github.com/melardev/AspNetCoreApiCrudMediatR)
- [Asp.Net Core + NHibernate](https://github.com/melardev/.NetCoreApiNHibernateCrud)
- [Asp.Net Core + ADO.Net](https://github.com/melardev/.NetCoreApiADO.NetCrud)
- [Asp.Net Core + Dapper](https://github.com/melardev/.NetCoreApiDapperCrud)
- [Asp.Net Web Api 2](https://github.com/melardev/AspNetWebApiCrud)
- [Asp.Net Web Api 2 + NHibernate](https://github.com/melardev/.NetWebApiNHibernateCrud)
- [Asp.Net Web Api 2 + ADO.Net](https://github.com/melardev/.NetWebApiADO.NetCrud)
- [Asp.Net Web Api 2 + Autofac](https://github.com/melardev/.NetWebApiAutofac)
- [Asp.Net Web Api 2 + Dapper](https://github.com/melardev/.NetWebApiDapperCrud)
- [Laravel](https://github.com/melardev/LaravelApiCrud)
- [Ruby On Rails](https://github.com/melardev/RailsApiCrud)
- [Ruby On Rails + JBuilder](https://github.com/melardev/RailsApiJBuilderCrud)
- [Spring Boot + Spring Data JPA](https://github.com/melardev/SpringBootApiJpaCrud)
- [Spring Boot + Spring Data MonoDb](https://github.com/melardev/JavaSpringBootApiMongoCrud)
- [Spring Boot + Reactive Spring Data MonoDb + Basic Auth](https://github.com/melardev/JavaSpringBootRxApiRxMongoRxHttpBasicCrud)
- [Kotlin Spring Boot + Reactive Spring Data MonoDb + Basic Auth](https://github.com/melardev/KotlinSpringBootRxApiRxMongoRxHttpBasicCrud)
- [Kotlin Spring Boot + Spring Data MonoDb](https://github.com/melardev/KotlinSpringBootApiMongoCrud)
- [Kotlin Spring Boot + Spring Data JPA](https://github.com/melardev/KotlinSpringBootApiJpaCrud)
- [Spring Boot + JAX-RS(Jersey) + Spring Data JPA](https://github.com/melardev/SpringBootApiJerseySpringDataCrud)
- [Spring Boot Reactive + MongoDB Reactive](https://github.com/melardev/SpringBootApiReactiveMongoCrud)
- [Kotlin Spring Boot Reactive + MongoDB Reactive](https://github.com/melardev/KotlinSpringBootRxApiRxMongoCrud)
- [Java Spring Boot Web Reactive + Spring Data](https://github.com/melardev/JavaSpringBootApiRxHybridCrud)
- [Kotlin Spring Boot Web Reactive + Spring Data](https://github.com/melardev/KotlinSpringBootApiRxHybridCrud)
- [Go + GORM](https://github.com/melardev/GoGormApiCrud)
- [Go + GinGonic + GORM](https://github.com/melardev/GoGinGonicApiGormCrud)
- [Go + Gorilla + GORM](https://github.com/melardev/GoMuxGormApiCrud)
- [Go + Beego(Web and ORM)](https://github.com/melardev/GoBeegoApiCrud)
- [Go + Beego + GORM](https://github.com/melardev/GoBeegoGormApiCrud)
- [Express.JS + Sequelize ORM](https://github.com/melardev/ExpressSequelizeApiCrud)
- [Express.JS + BookShelf ORM](https://github.com/melardev/ExpressBookshelfApiCrud)
- [Express.JS + Mongoose](https://github.com/melardev/ExpressMongooseApiCrud)

#### Microservices
- [Java Spring Boot Zuul + Rest](https://github.com/melardev/JavaSpringBootZuulRestApiCrud)
- [Kotlin Spring Boot Zuul + Rest](https://github.com/melardev/KotlinSpringBootZuulRestApiCrud)
- [Java Spring Cloud Eureka + Gateway + EurekaClient Proxy + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Gateway_EurekaProxy_RestCrud)
- [Java Spring Cloud Eureka + Gateway + LoadBalancedRest Proxy + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Gateway_LBRestProxy_RestCrud)
- [Java Spring Cloud Eureka + Gateway + Cloud Stream RabbitMQ + Admin + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Gateway_CloudStreamRabbitMQ_Admin_RestCrud)
- [Java Spring Cloud Eureka + Gateway + Config + Rest Swagger](https://github.com/melardev/Java_SpringCloud_Eureka_Gateway_Config_RestSwaggerCrud)
- [Java Spring Cloud Eureka + Zuul + Config + Kafka + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Zuul_Config_Kafka_RestCrud)
- [Java Spring Cloud Eureka + Zuul + Config + Hystrix + Turbine + Feign + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Zuul_Config_Hystrix_Turbine_Feign_RestCrud)
- [Java Spring Cloud Eureka + Zuul + Feign + Sleuth + Zipkin + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Zuul_Feign_Sleuth_Zipkin_RestCrud)
- [Java Spring Cloud Eureka + Gateway + Webflux + RxMongoDB + Rx Proxy with WebClient](https://github.com/melardev/Java_SpringCloud_Eureka_Gateway_RxWeb_RxMongoDb_RxProxy)
- [Java Spring Cloud Eureka + Config Server + Zuul + Kafka + Discovery Client Proxy + Rest](https://github.com/melardev/Java_SpringCloud_Eureka_Zuul_Config_Kafka_ProxyDiscovery_RestCrud)

### Client side implementations
- [React](https://github.com/melardev/ReactCrudAsync)
- [React + Redux](https://github.com/melardev/ReactReduxAsyncCrud)
- [Angular](https://github.com/melardev/AngularApiCrud)
- [Vue](https://github.com/melardev/VueAsyncCrud)
- [Vue + Vuex](https://github.com/melardev/VueVuexAsyncCrud)

#### The next come are
- Angular NgRx-Store
- Angular + Material
- React + Material
- React + Redux + Material
- Vue + Material
- Vue + Vuex + Material
- Ember
- Vanilla javascript

## Crud + Pagination
### Server side implementations
- [AspNet Core](https://github.com/melardev/AspNetCoreApiPaginatedCrud)
- [Asp.Net Core + NHibernate](https://github.com/melardev/.NetCoreApiNHibernateCrudPagination)
- [Asp.Net Core + MediatR](https://github.com/melardev/AspNetCoreApiPaginatedCrudMediatR)
- [Asp.Net Core + ADO.Net](https://github.com/melardev/.NetCoreApiADO.NetCrudPagination)
- [Asp.Net Core + Dapper](https://github.com/melardev/.NetCoreApiDapperCrudPagignation)
- [Asp.Net Web Api 2](https://github.com/melardev/WebApiPaginatedAsyncCrud)
- [Asp.Net Web Api 2 + NHibernate](https://github.com/melardev/.NetWebApiNHibernateCrudPagination)
- [Asp.Net Web Api 2 + ADO.Net](https://github.com/melardev/.NetWebApiADO.NetCrudPagination)
- [Asp.Net Web Api 2 + Autofac](https://github.com/melardev/.NetWebApiAutofacPagination)
- [Asp.Net Web Api 2 + Dapper](https://github.com/melardev/.NetWebApiDapperCrudPagination)
- [Spring Boot + Spring Data + Jersey](https://github.com/melardev/SpringBootJerseyApiPaginatedCrud)
- [Spring Boot + Spring Data](https://github.com/melardev/SpringBootApiJpaPaginatedCrud)
- [Spring Boot + Spring Data MonoDb](https://github.com/melardev/JavaSpringBootApiMongoCrudPagination)
- [Kotlin Spring Boot + Spring Data MonoDb](https://github.com/melardev/KotlinSpringBootApiMongoCrudPagination)
- [Spring Boot Reactive + Spring Data Reactive](https://github.com/melardev/ApiCrudReactiveMongo)
- [Java Spring Boot Web Reactive + Spring Data](https://github.com/melardev/JavaSpringBootApiRxHybridCrudPagination)
- [Kotlin Spring Boot Reactive + MongoDB Reactive](https://github.com/melardev/KotlinSpringBootRxApiRxMongoCrudPagination)
- [Kotlin Spring Boot Web Reactive + Spring Data](https://github.com/melardev/KotlinSpringBootApiRxHybridCrudPagination)
- [Spring Boot + Reactive Spring Data MonoDb + Basic Auth](https://github.com/melardev/JavaSpringBootRxApiRxMongoRxHttpBasicCrudPagination)
- [Kotlin Spring Boot + Reactive Spring Data MonoDb + Basic Auth](https://github.com/melardev/KotlinSpringBootRxApiRxMongoRxHttpBasicCrudPagination)
- [Go + GORM](https://github.com/melardev/GoGormApiCrudPagination)
- [Go + Gin Gonic + GORM](https://github.com/melardev/GoGinGonicApiPaginatedCrud)
- [Go + Gorilla + GORM](https://github.com/melardev/GoMuxGormApiCrudPagination)
- [Go + Beego(Web and ORM)](https://github.com/melardev/GoBeegoApiCrudPagination)
- [Go + Beego(Web) + GORM)](https://github.com/melardev/GoBeegoGormApiCrudPagination)
- [Laravel](https://github.com/melardev/LaravelApiPaginatedCrud)
- [Rails + JBuilder](https://github.com/melardev/RailsJBuilderApiPaginatedCrud)
- [Rails](https://github.com/melardev/RailsApiPaginatedCrud)
- [NodeJs Express + Sequelize](https://github.com/melardev/ExpressSequelizeApiPaginatedCrud)
- [NodeJs Express + Bookshelf](https://github.com/melardev/ExpressBookshelfApiPaginatedCrud)
- [NodeJs Express + Mongoose](https://github.com/melardev/ExpressApiMongoosePaginatedCrud)
- [Python Django](https://github.com/melardev/DjangoApiCrudPaginated)
- [Python Django + Rest Framework](https://github.com/melardev/DjangoRestFrameworkPaginatedCrud)
- [Python Flask](https://github.com/melardev/FlaskApiPaginatedCrud)


#### MicroServices
- [Java Spring Boot Zuul + Rest](https://github.com/melardev/JavaSpringBootZuulRestApiPaginatedCrud)
- [Kotlin Spring Boot Zuul + Rest](https://github.com/melardev/KotlinSpringBootZuulRestApiPaginatedCrud)

#### The next come are
- NodeJs Express + Knex
- Flask + Flask-Restful
- Laravel + Fractal
- Laravel + ApiResources
- Go with Mux
- AspNet Web Api 2
- Jersey
- Elixir

### Client side implementations
- [Angular](https://github.com/melardev/AngularPaginatedAsyncCrud)
- [React-Redux](https://github.com/melardev/ReactReduxPaginatedAsyncCrud)
- [React](https://github.com/melardev/ReactAsyncPaginatedCrud)
- [Vue + Vuex](https://github.com/melardev/VueVuexPaginatedAsyncCrud)
- [Vue](https://github.com/melardev/VuePaginatedAsyncCrud)


#### The next come are
- Angular NgRx-Store
- Angular + Material
- React + Material
- React + Redux + Material
- Vue + Material
- Vue + Vuex + Material
- Ember
- Vanilla javascript

## E-commerce
### Server side implementations
- [Spring Boot + Spring Data Hibernate](https://github.com/melardev/SBootApiEcomMVCHibernate)
- [Spring Boot + JAX-RS Jersey + Spring Data Hibernate](https://github.com/melardev/SpringBootEcommerceApiJersey)
- [Node Js + Sequelize](https://github.com/melardev/ApiEcomSequelizeExpress)
- [Node Js + Bookshelf](https://github.com/melardev/ApiEcomBookshelfExpress)
- [Node Js + Mongoose](https://github.com/melardev/ApiEcomMongooseExpress)
- [Python Django](https://github.com/melardev/DjangoRestShopApy)
- [Flask](https://github.com/melardev/FlaskApiEcommerce)
- [Golang go gonic](https://github.com/melardev/api_shop_gonic)
- [Ruby on Rails](https://github.com/melardev/RailsApiEcommerce)
- [AspNet Core](https://github.com/melardev/ApiAspCoreEcommerce)
- [Laravel](https://github.com/melardev/ApiEcommerceLaravel)

The next to come are:
- Spring Boot + Spring Data Hibernate + Kotlin
- Spring Boot + Jax-RS Jersey + Hibernate + Kotlin
- Spring Boot + mybatis
- Spring Boot + mybatis + Kotlin
- Asp.Net Web Api v2
- Elixir
- Golang + Beego
- Golang + Iris
- Golang + Echo
- Golang + Mux
- Golang + Revel
- Golang + Kit
- Flask + Flask-Restful
- AspNetCore + NHibernate
- AspNetCore + Dapper

### Client side implementations
This client side E-commerce application is also implemented using other client side technologies:
- [React Redux](https://github.com/melardev/ReactReduxEcommerceRestApi)
- [React](https://github.com/melardev/ReactEcommerceRestApi)
- [Vue](https://github.com/melardev/VueEcommerceRestApi)
- [Vue + Vuex](https://github.com/melardev/VueVuexEcommerceRestApi)
- [Angular](https://github.com/melardev/AngularEcommerceRestApi)

## Blog/CMS
### Server side implementations
### Client side
#### The next come are
- Angular NgRx-Store
- Angular + Material
- React + Material
- React + Redux + Material
- Vue + Material
- Vue + Vuex + Material
- Ember

# Social media links
- [Youtube Channel](https://youtube.com/melardev) I publish videos mainly on programming
- [Blog](http://melardev.com) Sometimes I publish the source code there before Github
- [Twitter](https://twitter.com/@melardev) I share tips on programming
- [Instagram](https://instagram.com/melar_dev) I share from time to time nice banners
