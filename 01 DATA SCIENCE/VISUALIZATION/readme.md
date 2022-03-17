# Data Visualization

There are multiple visualization libararies which each have their advantages and disadvantages. I will describe the three, at least in my opinion, most useful visualization libraries. It's never a bad idea to at least learn the basics of each one, because some work better for certain charts (for example heatmaps) while other work better for other chart types.

<br>

## 1) Plotly

My favorite visualization library. It has a relatively easy syntax in comparison to the others and is suitable for setting up charts quick. A big advantage is that you are able to create interactive charts out of the box with sliders, zooming ability and hover options. There are two ways to use plotly:  

* **Graph Objects** Standard way. In comparison to Plotly express the syntax is bit heavier and longer. Ideally if you want to built highly customized charts.

* **Plotly Express** Quick chart-generating Libary. Offers a preset of charts from graph objects with an easier syntax and easier connection with dataframes.

## 2) Matplotlib

The 'standard' way of creating plots, often described as the go-to Libary. Matplotlib offers many functions for customizing charts.

## 3) Seaborn

Another visualization library which can be used for a variety of beautiful plots. Has some nice built-in plots which other libraries don't offer out of the box (like heatmaps). Works well with dataframes too.