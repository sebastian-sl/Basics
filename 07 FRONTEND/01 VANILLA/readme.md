## Vanilla HTML & CSS Basics

``` html
<html>  
    <head>
        <title> Test \</title>  

        <!-- External CSS / JS> -->
        <link rel="stylesheet" href="">
        <script src=""> </script>

        <!-- Inline CSS / JS -->
        <style> </style>
        <script> </script>
    </head>


    <body>
        <!-- Header and Titles -->
        <header> 
            <h1> Header </h1>
            <p> subtext </p>
        </header>

        <!-- Table -->
        <table>
                <tr>
                    <th> Month </th>
                <tr>
                <tr>
                    <td> Jan </td>
                </tr>
        </table>


        <!-- Lists (ul for unordered, ol for ordered) -->
        <ul>
            <li> Item 1 </li>
            <li> Item 2 </li>
        </ul>
        


        <!-- Forms -->
        <form>
            <label for "fname"> First Name: </label>
            <input type="text" id="fname" name="fname"> 
            
            <input type="radio" id="radio">
            <label for="radio"> Radio Box </label>
        </form>


        <!-- Template (won't be displayed on load!) -->
        <template id="temp">
            <p> Testtemplate
        </template>


        <!-- Links -->
        <a href="google.de"> Google </a>


        <!-- Images -->
        <img src="test.jpg">
    </body>
</html>