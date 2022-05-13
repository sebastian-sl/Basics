## 1) Supervised Learning
Supervised Learning means we give the algorithm a training dataset which contains multiple variables __and the corrensponding outcomes__. With that training data the algorithm tries to build a mathematical equation that fits the best, aka can reproduce the outcomes. With that model we can input new variables and it will use the built equation to predict new outcomes.

### 1.1) Regression
We use regression when we want to build a model that predicts __numeric outcomes__. For example: sales predictions or attendance predictions.  

* __Linear Regression__
* __Polynomial Regression__
* __Decision Trees / Random Forests__
* Neural Networks

[[Sklearn]](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1.1%20Supervised%20-%20Regression.ipynb)

### 1.2) Classification
Classification means that we want to predict a result, that has two outcomes __True/False__. Some examples would be Image Detection or if a Student passes a Test or not.

* __Logistic Regression__
* __Decision Trees / Random Forests__
* SVM
* Naive Bayes
* Neural Networks

[[Sklearn]](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1.2%20Supervised%20-%20Classification.ipynb)

## 2) Unsupervised Learning - Clustering
In unsupervised Learning we have __no result/outcome__ value, so instead we try to build clusters/groups with multiple variables that seem to fit together.  For example: identify spam or classifying music. With a built model we can enter a new datapoint (song for example) with variables and then try to put it into the corresponding cluster/group (music genre).

* k-means
* k-nearest Neighbors
* PCA
