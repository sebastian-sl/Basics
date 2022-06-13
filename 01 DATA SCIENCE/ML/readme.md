## 1) Supervised Learning
Supervised learning means we give the model a training dataset which contains both the object (variables) __and the class (corresponding outcome)__. The Model then proceeds to build a an algorithm that fits the best, as in can reproduce the classes (outcome) for the objects of the training dataset. When the model is trained, we can input new objects with new variables and the model will predict the outcome.

### 1.1) Regression
Regression analysis is statistical method to predict __numerical outcomes__. Examples: Sales/Attendance/Score Predictions

* __Linear Regression__
* __Polynomial Regression__
* __Decision Trees / Random Forests__
* Neural Networks

[[Sklearn]](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1_1_Supervised_Regression.ipynb)

### 1.2) Classification
Classification is a method to assign objects into different __preset classes (can just be True/False)__. Examples: Spam Filter, Image Detection, Predicting binary results (tests)

* __Logistic Regression__
* __Decision Trees / Random Forests__
* __SVM__
* __Naive Bayes__
* __k-nearest Neighbors__
* Neural Networks

[[Sklearn]](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1_2_Supervised_Classification.ipynb)

## 2) Unsupervised Learning - Clustering
Unsupervised learning means we give the model a training dataset with objects which __doesn't contain the corresponding classes (outcomes)__. Instead we try to build a model which clusters/groups the objects together that seem to fit together depending on their object variables. If we want to enter a new object with variables, we can see which corresponding cluster it belongs and which objects are similiar to it. Examples: User/Buyer behaviour, Player performance in sports

* __k-means__
* PCA

[[Sklearn]](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/2_Unsupervised_Clustering.ipynb)
