# Django Rest API Tutorial

### Setup

* Install django & djangorestframework
* <b> django-admin startproject -name- </b> to create Project folder
* cd into the project folder
* <b> django-admin startapp -name- </b> to create app


### Configuration

* Add <b> rest_framework </b> and <b> appname </b> to INSTALLED APPS in Projects settings.py


### Creating the API

* edit App view with api_view and response [LINK](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/DJANGO_RESTAPI/api/views.py)
* create App urls with imported views and path [LINK](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/DJANGO_RESTAPI/api/urls.py)
* edit Project urls with included app.urls [LINK](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/DJANGO_RESTAPI/DJANGO_RESTAPI/urls.py)

### Run Server

* python manage.py migrate
* python manage.py runserver
