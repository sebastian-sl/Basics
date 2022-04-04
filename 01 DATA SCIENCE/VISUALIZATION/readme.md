# Data Visualization

There are multiple visualization libararies which each have their advantages and disadvantages. I will only describe the two, for me most used visualization librarires (plotly and seaborn). There are quite more, for example matplotlib/ggplot/bokeh, but i think its best to get used to one or maybe two and learn the details of these ones instead of trying to learn all.

<br>

## 1) Plotly

My favorite visualization library. It has a relatively easy syntax in comparison to the others and is suitable for setting up charts quick. A big advantage is that you are able to create interactive charts out of the box with sliders, zooming ability and hover options. There are two ways to use plotly: via Graph Objects or via Plotly Express. The official documentation recommends using plotly express whenever you can, because you can create a graph in 1 line of code instead of 5-100 lines. Personally, i would recommend Graph Objects only if you need a highly customized chart that isnt possible in express.

## 2) Matplotlib / Seaborn

Here we will use a combination of matplotlib and seaborn. Seaborn is a library built on matplotlib which enables nice built-in plots with a way easier usage for DataFrames in terms of syntax. In Addition we will use matplotlib for certain charts that aren't
available in seaborn. Using matplotlib only is also a possiblity, but the difficulty to create nice charts is quite high.
