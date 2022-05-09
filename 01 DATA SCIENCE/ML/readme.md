## 1) Supervised Learning
Supervised Learning means we give the algorithm a training dataset which contains multiple variables __and the corrensponding outcomes__. With that training data the algorithm tries to build a mathematical equation that fits the best, aka can reproduce the outcomes. With that model we can input new variables and it will use the built equation to predict new outcomes.

### 1.1) [Regression](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1.1%20Supervised%20-%20Regression.ipynb)
We use regression when we want to build a model that predicts __numeric outcomes__. For example: sales predictions or attendance predictions.  

* Linear Regression
* Polynomial Regression
* Decision Trees / Random Forests
* Neural Networks

### 1.2) [Classification](https://github.com/sebastian-sl/Basics/blob/main/01%20DATA%20SCIENCE/ML/SKLEARN/1.2%20Supervised%20-%20Classification.ipynb)
Classification means that we want to predict a result, that has two outcomes __True/False__. Some examples would be Image Detection or if a Student passes a Test or not.

* Logistic Regression
* Random Forests
* SVM
* Naive Bayes
* Neural Networks

## 2) Unsupervised Learning - Clustering
In unsupervised Learning we have __no result/outcome__ value, so instead we try to build clusters/groups with multiple variables that seem to fit together.  For example: identify spam or classifying music. With a built model we can enter a new datapoint (song for example) with variables and then try to put it into the corresponding cluster/group (music genre).

* k-means
* k-nearest Neighbors
* PCA
