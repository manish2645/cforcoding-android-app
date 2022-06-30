package com.bytecode.cforcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public class MiscellaneousProgram extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<PatternModel> patternModels = new ArrayList<>();

    int[] patternImages = {R.drawable.nthree,R.drawable.ntwo,R.drawable.none,R.drawable.nfour,R.drawable.number,R.drawable.six,R.drawable.seven,R.drawable.eight,
            R.drawable.nnine,R.drawable.nten,R.drawable.neleven,R.drawable.ntwelve,R.drawable.nthirteen,R.drawable.nfouteen,R.drawable.nfifteen,R.drawable.nsixteen,
            R.drawable.nseventeen,R.drawable.neighteen,R.drawable.nninteen,R.drawable.ntwenty,R.drawable.ntwentyone,R.drawable.ntwentytwo,R.drawable.ntwentythree,
            R.drawable.ntwentryfour,R.drawable.ntwentyfive};
    int[] Output = {R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,
                    R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,
                    R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,R.drawable.stars,
                    R.drawable.stars};
    int[] videoIcon = {R.drawable.misc1,R.drawable.misc2,R.drawable.misc3,R.drawable.misc4,R.drawable.misc5,R.drawable.misc6,R.drawable.misc7,R.drawable.misc8,
                        R.drawable.misc9,R.drawable.misc10,R.drawable.misc11,R.drawable.misc12,R.drawable.misc13,R.drawable.misc14,R.drawable.misc15,R.drawable.misc16,
                        R.drawable.misc17,R.drawable.misc18,R.drawable.misc19,R.drawable.misc20,R.drawable.misc21,R.drawable.misc22,R.drawable.misc23,R.drawable.misc24,
                        R.drawable.misc25};
    String[] sourceCode = {
            /*1*/
            "// PRIME NUMBER\n" +
                    "\t     #include<stdio.h>  \n" +
                    "\t     int main(){    \n" +
                    "\t     int n,i,m=0,flag=0;    \n" +
                    "\t     printf(\"Enter the number to check prime:\");    \n" +
                    "\t     scanf(\"%d\",&n);    \n" +
                    "\t     m=n/2;    \n" +
                    "\t     for(i=2;i<=m;i++)    \n" +
                    "\t     {    \n" +
                    "\t          if(n%i==0)    \n" +
                    "\t\t       {    \n" +
                    "\t\t           printf(\"Number is not prime\");    \n" +
                    "\t\t           flag=1;    \n" +
                    "\t\t           break;    \n" +
                    "\t\t       }    \n" +
                    "\t     }    \n" +
                    "\t     if(flag==0)    \n" +
                    "\t     printf(\"Number is prime\");     \n" +
                    "\t     return 0;  \n" +
                    "\t     }",
            /*2*/
            "// FIBONACCI SERIES" +
                    "\t #include<stdio.h>    \n" +
                    "\t int main()    \n" +
                    "\t {    \n" +
                    "\t     int n1=0,n2=1,n3,i,number;    \n" +
                    "\t     printf(\"Enter the number of elements:\");    \n" +
                    "\t     scanf(\"%d\",&number);    \n" +
                    "\t     printf(\"\\n%d %d\",n1,n2);//printing 0 and 1    \n" +
                    "\t     for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    \n" +
                    "\t     {    \n" +
                    "\t\t       n3=n1+n2;    \n" +
                    "\t\t       printf(\" %d\",n3);    \n" +
                    "\t\t       n1=n2;    \n" +
                    "\t\t       n2=n3;    \n" +
                    "\t      }  \n" +
                    "\t     return 0;  \n" +
                    "\t     }    ",
            /*3*/
            "//FACTORIAL OF A NUMBER" +
                    "\t #include<stdio.h>  \n" +
                    "\t int main()    \n" +
                    "\t {    \n" +
                    "\t     int i,fact=1,number;    \n" +
                    "\t     printf(\"Enter a number: \");    \n" +
                    "\t     scanf(\"%d\",&number);    \n" +
                    "\t     for(i=1;i<=number;i++){    \n" +
                    "\t         fact=fact*i;    \n" +
                    "\t     }    \n" +
                    "\t     printf(\"Factorial of %d is: %d\",number,fact);    \n" +
                    "\t     return 0;  \n" +
                    "\t     } ",
            /*4*/
            "#include<stdio.h>  \n" +
                    "   int main()    \n" +
                    "   {    \n" +
                    "       int n,sum=0,m;    \n" +
                    "       printf(\"Enter a number:\");    \n" +
                    "       scanf(\"%d\",&n);    \n" +
                    "       while(n>0)    \n" +
                    "       {    \n" +
                    "           m=n%10;    \n" +
                    "           sum=sum+m;    \n" +
                    "           n=n/10;    \n" +
                    "       }    \n" +
                    "   printf(\"Sum is=%d\",sum);    \n" +
                    "   return 0;  \n" +
                    "   }   ",
            /*5*/
    "#include <stdio.h>\n" +
            " \n" +
            "int main()\n" +
            "{\n" +
            "    int num;\n" +
            " \n" +
            "    printf(\"Enter a number: \\n\");\n" +
            "    scanf(\"%d\", &num);\n" +
            "    if (num > 0)\n" +
            "        printf(\"%d is a positive number \\n\", num);\n" +
            "    else if (num < 0)\n" +
            "        printf(\"%d is a negative number \\n\", num);\n" +
            "    else\n" +
            "        printf(\"0 is neither positive nor negative\");\n" +
            "}",
    /*6*/
    "#include<stdio.h>\n" +
            "int main(){\n" +
            "   int num,reverse_number;\n" +
            "\n" +
            "   //User would input the number\n" +
            "   printf(\"\\nEnter any number:\");\n" +
            "   scanf(\"%d\",&num);\n" +
            "\n" +
            "   //Calling user defined function to perform reverse\n" +
            "   reverse_number=reverse_function(num);\n" +
            "   printf(\"\\nAfter reverse the no is :%d\",reverse_number);\n" +
            "   return 0;\n" +
            "}\n" +
            "int sum=0,rem;\n" +
            "reverse_function(int num){\n" +
            "   if(num){\n" +
            "      rem=num%10;\n" +
            "      sum=sum*10+rem;\n" +
            "      reverse_function(num/10);\n" +
            "   }\n" +
            "   else\n" +
            "      return sum;\n" +
            "   return sum;\n" +
            "}",
    /*7*/
    "#include <stdio.h>\n" +
            "int main()\n" +
            "{\n" +
            "    int y;\n" +
            "    printf(\"Enter year: \");\n" +
            "    scanf(\"%d\",&y);\n" +
            "    if(y % 4 == 0)\n" +
            "    {\n" +
            "    \t//Nested if else\n" +
            "        if( y % 100 == 0)\n" +
            "        {\n" +
            "            if ( y % 400 == 0)\n" +
            "                printf(\"%d is a Leap Year\", y);\n" +
            "            else\n" +
            "                printf(\"%d is not a Leap Year\", y);\n" +
            "        }\n" +
            "        else\n" +
            "            printf(\"%d is a Leap Year\", y );\n" +
            "    }\n" +
            "    else\n" +
            "        printf(\"%d is not a Leap Year\", y);\n" +
            "    return 0;\n" +
            "}",
            /*8*/
            "#include <stdio.h>\n" +
            "int main()\n" +
            "{\n" +
            "   int num, reverse_num=0, remainder,temp;\n" +
            "   printf(\"\\nEnter an integer: \");\n" +
            "   scanf(\"%d\", &num);\n" +
            "   temp=num;\n" +
            "   while(temp!=0)\n" +
            "   {\n" +
            "      remainder=temp%10;\n" +
            "      reverse_num=reverse_num*10+remainder;\n" +
            "      temp/=10;\n" +
            "   }  \n" +
            "   if(reverse_num==num) \n" +
            "      printf(\"\\n%d is a palindrome number\\n\\n\",num);\n" +
            "   else\n" +
            "      printf(\"\\n%d is not a palindrome number\\n\\n\",num);\n" +
            "   return 0;\n" +
            "}",
    /*9*/
            "#include<stdio.h>  \n" +
                    " int main()    \n" +
                    "{    \n" +
                    "int n,r,sum=0,temp;    \n" +
                    "printf(\"enter the number=\");    \n" +
                    "scanf(\"%d\",&n);    \n" +
                    "temp=n;    \n" +
                    "while(n>0)    \n" +
                    "{    \n" +
                    "r=n%10;    \n" +
                    "sum=sum+(r*r*r);    \n" +
                    "n=n/10;    \n" +
                    "}    \n" +
                    "if(temp==sum)    \n" +
                    "printf(\"armstrong  number \");    \n" +
                    "else    \n" +
                    "printf(\"not armstrong number\");    \n" +
                    "return 0;  \n" +
                    "}   ",
    /*10*/
            "#include<stdio.h>  \n" +
                    " int main()    \n" +
                    "{    \n" +
                    "int a=10, b=20;      \n" +
                    "printf(\"Before swap a=%d b=%d\",a,b);      \n" +
                    "a=a+b;//a=30 (10+20)    \n" +
                    "b=a-b;//b=10 (30-20)    \n" +
                    "a=a-b;//a=20 (30-10)    \n" +
                    "printf(\"\\nAfter swap a=%d b=%d\",a,b);    \n" +
                    "return 0;  \n" +
                    "}   ",
    /*11*/
            "#include<stdio.h>    \n" +
                    "#include<stdlib.h>  \n" +
                    "int main(){  \n" +
                    "int a[10],n,i;    \n" +
                    "system (\"cls\");  \n" +
                    "printf(\"Enter the number to convert: \");    \n" +
                    "scanf(\"%d\",&n);    \n" +
                    "for(i=0;n>0;i++)    \n" +
                    "{    \n" +
                    "a[i]=n%2;    \n" +
                    "n=n/2;    \n" +
                    "}    \n" +
                    "printf(\"\\nBinary of Given Number is=\");    \n" +
                    "for(i=i-1;i>=0;i--)    \n" +
                    "{    \n" +
                    "printf(\"%d\",a[i]);    \n" +
                    "}    \n" +
                    "return 0;  \n" +
                    "}  ",
    /*12*/
            "#include <stdio.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    int rows, cols;  \n" +
                    "    //Initialize matrix a  \n" +
                    "    int a[][3] = {  \n" +
                    "                    {1, 0, 1},  \n" +
                    "                    {4, 5, 6},  \n" +
                    "                    {1, 2, 3}  \n" +
                    "                };  \n" +
                    "    //Initialize matrix b  \n" +
                    "    int b[][3] = {  \n" +
                    "                      {1, 1, 1},  \n" +
                    "                      {2, 3, 1},  \n" +
                    "                      {1, 5, 1}  \n" +
                    "                 };  \n" +
                    "    //Calculates number of rows and columns present in given matrix  \n" +
                    "    rows = (sizeof(a)/sizeof(a[0]));  \n" +
                    "    cols = (sizeof(a)/sizeof(a[0][0]))/rows;  \n" +
                    "    //Array sum will hold the result  \n" +
                    "    int sum[rows][cols];  \n" +
                    "    //Performs addition of matrices a and b. Store the result in matrix sum  \n" +
                    "    for(int i = 0; i < rows; i++){  \n" +
                    "        for(int j = 0; j < cols; j++){  \n" +
                    "            sum[i][j] = a[i][j] + b[i][j];  \n" +
                    "        }  \n" +
                    "    }  \n" +
                    "    printf(\"Addition of two matrices: \\n\");  \n" +
                    "    for(int i = 0; i < rows; i++){  \n" +
                    "        for(int j = 0; j < cols; j++){  \n" +
                    "           printf(\"%d \", sum[i][j]);  \n" +
                    "        }  \n" +
                    "        printf(\"\\n\");  \n" +
                    "    }  \n" +
                    "    return 0;  \n" +
                    "}  ",
    /*13*/
            "#include <stdio.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    int rows, cols;  \n" +
                    "    //Initialize matrix a  \n" +
                    "    int a[][3] = {  \n" +
                    "                    {4, 5, 6},  \n" +
                    "                    {3, 4, 1},  \n" +
                    "                    {1, 2, 3}  \n" +
                    "                 };  \n" +
                    "    //Initialize matrix b  \n" +
                    "    int b[][3] = {  \n" +
                    "                      {2, 0, 3},  \n" +
                    "                     {2, 3, 1},  \n" +
                    "                     {1, 1, 1}  \n" +
                    "                 };  \n" +
                    "    //Calculates number of rows and columns present in given matrix  \n" +
                    "    rows = (sizeof(a)/sizeof(a[0]));  \n" +
                    "    cols = (sizeof(a)/sizeof(a[0][0]))/rows;  \n" +
                    "    //Array diff will hold the result  \n" +
                    "    int diff[rows][cols];  \n" +
                    "    //Performs subtraction of matrices a and b. Store the result in matrix diff  \n" +
                    "    for(int i = 0; i < rows; i++){  \n" +
                    "        for(int j = 0; j < cols; j++){  \n" +
                    "            diff[i][j] = a[i][j] - b[i][j];  \n" +
                    "        }  \n" +
                    "    }  \n" +
                    "    printf(\"Subtraction of two matrices: \\n\");  \n" +
                    "    for(int i = 0; i < rows; i++){  \n" +
                    "        for(int j = 0; j < cols; j++){  \n" +
                    "           printf(\"%d \", diff[i][j]);  \n" +
                    "        }  \n" +
                    "        printf(\"\\n\");  \n" +
                    "    }  \n" +
                    "    return 0;  \n" +
                    "}  ",
    /*14*/
            "#include <stdio.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    int row1, col1, row2, col2;  \n" +
                    "    //Initialize matrix a  \n" +
                    "    int a[][3] = {  \n" +
                    "                    {1, 3, 2},  \n" +
                    "                    {3, 1, 1},  \n" +
                    "                    {1, 2, 2}  \n" +
                    "                 };  \n" +
                    "    //Initialize matrix b  \n" +
                    "    int b[][3] = {  \n" +
                    "                      {2, 1, 1},  \n" +
                    "                     {1, 0, 1},  \n" +
                    "                     {1, 3, 1}  \n" +
                    "                 };  \n" +
                    "    //Calculates number of rows and columns present in first matrix  \n" +
                    "    row1 = (sizeof(a)/sizeof(a[0]));  \n" +
                    "    col1 = (sizeof(a)/sizeof(a[0][0]))/row1;  \n" +
                    "    //Calculates number of rows and columns present in second matrix  \n" +
                    "    row2 = (sizeof(b)/sizeof(b[0]));  \n" +
                    "    col2 = (sizeof(b)/sizeof(b[0][0]))/row2;  \n" +
                    "    //For two matrices to be multiplied,   \n" +
                    "    //number of columns in first matrix must be equal to number of rows in second matrix  \n" +
                    "    if(col1 != row2){  \n" +
                    "        printf(\"Matrices cannot be multiplied \\n\");  \n" +
                    "    }  \n" +
                    "    else{  \n" +
                    "        //Array prod will hold the result  \n" +
                    "        int prod[row1][col2];  \n" +
                    "        //Performs product of matrices a and b. Store the result in matrix prod  \n" +
                    "        for(int i = 0; i < row1; i++){  \n" +
                    "            for(int j = 0; j < col2; j++){  \n" +
                    "                prod[i][j] = 0;  \n" +
                    "                for(int k = 0; k < row2; k++){  \n" +
                    "                   prod[i][j] = prod[i][j] + a[i][k] * b[k][j];   \n" +
                    "                }  \n" +
                    "            }  \n" +
                    "        printf(\"Product of two matrices: \\n\");  \n" +
                    "        for(int i = 0; i < row1; i++){  \n" +
                    "            for(int j = 0; j < col2; j++){  \n" +
                    "               printf(\"%d \", prod[i][j]);  \n" +
                    "            }  \n" +
                    "            printf(\"\\n\");  \n" +
                    "        }  \n" +
                    "    }  \n" +
                    "    return 0;  \n" +
                    "}",
    /*15*/
            "#include <stdio.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    int num, i; // declare a variable  \n" +
                    "    printf (\" Enter a number to generate the table in C: \");  \n" +
                    "    scanf (\" %d\", &num); // take a positive number from the user  \n" +
                    "      \n" +
                    "    printf (\"\\n Table of %d\", num);  \n" +
                    "    // use for loop to iterate the number from 1 to 10  \n" +
                    "    for ( i = 1; i <= 10; i++)  \n" +
                    "    {  \n" +
                    "        printf (\"\\n %d * %d = %d\", num, i, (num*i));  \n" +
                    "    }  \n" +
                    "    return 0;  \n" +
                    "}  ",
    /*16*/
            "#include <stdio.h>  \n" +
                    "#include <conio.h>  \n" +
                    "void main()  \n" +
                    "{  \n" +
                    "    int num1, num2, max_div, flag = 1;  \n" +
                    "    // accept any two positive number from the user  \n" +
                    "    printf( \" Enter any two positive numbers to get the LCM \\n \");  \n" +
                    "    scanf(\" %d %d\", &num1, &num2);  \n" +
                    "      \n" +
                    "    // max_div variable holds the max divisible number between num1 and num2.  \n" +
                    "    max_div = (num1 > num2) ? num1 : num2;  \n" +
                    "      \n" +
                    "    while (flag) // (flag = 1)  \n" +
                    "    {  \n" +
                    "        if (max_div % num1 == 0 && max_div % num2 == 0)  \n" +
                    "        {  \n" +
                    "            printf( \" The LCM of %d and %d is %d. \", num1, num2, max_div);  \n" +
                    "            break;  \n" +
                    "        }  \n" +
                    "        ++max_div; // pre-increment max_div  \n" +
                    "    }  \n" +
                    "}  ",
    /*17*/
            "#include <stdio.h>  \n" +
                    "#include <conio.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    // declare the variables  \n" +
                    "    int n1, n2, i, GCD_Num;  \n" +
                    "    printf ( \" Enter any two numbers: \\n \");  \n" +
                    "    scanf ( \"%d %d\", &n1, &n2);   \n" +
                    "      \n" +
                    "    // use for loop  \n" +
                    "    for( i = 1; i <= n1 && i <= n2; ++i)  \n" +
                    "    {  \n" +
                    "        if (n1 % i ==0 && n2 % i == 0)  \n" +
                    "            GCD_Num = i; /* if n1 and n2 is completely divisible by i, the divisible number will be the GCD_Num */  \n" +
                    "    }  \n" +
                    "    // print the GCD of two numbers  \n" +
                    "    printf (\" GCD of two numbers %d and %d is %d.\", n1, n2, GCD_Num);  \n" +
                    "    return 0;  \n" +
                    "}  ",
    /*18*/
            "#include <stdio.h>    \n" +
                    "int main()    \n" +
                    "{    \n" +
                    "    //Initialize array     \n" +
                    "    int arr[] = {1, 2, 3, 4, 5};     \n" +
                    "    //Calculate length of array arr    \n" +
                    "    int length = sizeof(arr)/sizeof(arr[0]);    \n" +
                    "    printf(\"Original array: \\n\");    \n" +
                    "    for (int i = 0; i < length; i++) {     \n" +
                    "        printf(\"%d \", arr[i]);     \n" +
                    "    }      \n" +
                    "    printf(\"\\n\");    \n" +
                    "    printf(\"Array in reverse order: \\n\");    \n" +
                    "    //Loop through the array in reverse order    \n" +
                    "    for (int i = length-1; i >= 0; i--) {     \n" +
                    "        printf(\"%d \", arr[i]);     \n" +
                    "    }     \n" +
                    "    return 0;    \n" +
                    "}    ",
    /*19*/
            "#include <stdio.h>  \n" +
                    "#include <string.h>  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "    char str[40]; // declare the size of character string  \n" +
                    "    printf (\" \\n Enter a string to be reversed: \");  \n" +
                    "    scanf (\"%s\", str);  \n" +
                    "      \n" +
                    "    // use strrev() function to reverse a string  \n" +
                    "    printf (\" \\n After the reverse of a string: %s \", strrev(str));  \n" +
                    "    return 0;  \n" +
                    "}  ",
    /*20*/
            "#include <stdio.h>  \n" +
                    "#include <math.h>  \n" +
                    "int main ()  \n" +
                    "{  \n" +
                    "// declare base and exp variable   \n" +
                    "int base, exp;  \n" +
                    "int result; // store the result  \n" +
                    "printf (\" Enter the base value from the user: \");  \n" +
                    "scanf (\" %d\", &base); // get base from user  \n" +
                    "printf (\" Enter the power value for raising the power of base: \");  \n" +
                    "scanf (\" %d\", &exp); // get exponent from user  \n" +
                    "  \n" +
                    "// use pow() function to pass the base and the exp value as arguments  \n" +
                    "result = pow ( base, exp);  \n" +
                    "printf (\" %d to the power of %d is = %d \", base, exp, result);  \n" +
                    "return 0;  \n" +
                    "}  ",
    /*21*/
            "#include<stdio.h>  \n" +
                    "                   int main()   \n" +
                    "                   {   \n" +
                    "                   float fahrenheit, celsius;  \n" +
                    "                   celsius = 24;  \n" +
                    "                   fahrenheit =( (celsius*9)/5)+32;  \n" +
                    "                   printf(\"\\n\\n Temperature in fahrenheit is:  %f\",fahrenheit);  \n" +
                    "                       return (0);  \n" +
                    "    } ",
    /*22*/
            "#include<stdio.h>  \n" +
                    "                   int main()   \n" +
                    "                   { float Fahrenheit, Celsius;  \n" +
                    "                   Fahrenheit = 64;  \n" +
                    "                   Celsius = ((Fahrenheit-32)*5)/9;  \n" +
                    "                   printf(\"\\n\\n Temperature in Celsius is : %f\",Celsius);  \n" +
                    "                       return (0);  \n" +
                    "    }  ",
    /*23*/
            "#include<stdio.h>  \n" +
                    "                   int main()   \n" +
                    "                   { float b ,h, area;  \n" +
                    "            b= 5;  \n" +
                    "                                       h= 13;  \n" +
                    "            area = (b*h) / 2 ;  \n" +
                    "  \n" +
                    "            printf(\"\\n\\n Area of Triangle is: %f\",area);  \n" +
                    "                       return (0);  \n" +
                    "    } ",
    /*24*/
            "#include<stdio.h>  \n" +
                    "int main(){      \n" +
                    "int i=0;    \n" +
                    "int marks[5];//declaration of array       \n" +
                    "marks[0]=80;//initialization of array    \n" +
                    "marks[1]=60;    \n" +
                    "marks[2]=70;    \n" +
                    "marks[3]=85;    \n" +
                    "marks[4]=75;    \n" +
                    "//traversal of array    \n" +
                    "for(i=0;i<5;i++){      \n" +
                    "printf(\"%d \\n\",marks[i]);    \n" +
                    "}//end of for loop     \n" +
                    "return 0;  \n" +
                    "}    ",
    /*25*/
            "#include <iostream>  \n" +
                    "  \n" +
                    "  \n" +
                    "using namespace std;  \n" +
                    "  \n" +
                    "int main()  \n" +
                    "{  \n" +
                    "  \n" +
                    "    time_t now = time(0); // get current dat/time with respect to system  \n" +
                    "  \n" +
                    "    char* dt = ctime(&now); // convert it into string  \n" +
                    "  \n" +
                    "    cout << \"The local date and time is: \" << dt << endl; // print local date and time  \n" +
                    "  \n" +
                    "    tm* gmtm = gmtime(&now); // for getting time to UTC convert to struct  \n" +
                    "    dt = asctime(gmtm);  \n" +
                    "    cout << \"The UTC date and time is:\" << dt << endl; // print UTC date and time  \n" +
                    "}  "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miscellaneous_program);

        getSupportActionBar().setTitle("Miscellaneous Programs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setPatternModels();
        NumberAdapter adapter = new NumberAdapter(this,patternModels,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setPatternModels(){
        String[] patternModelsNames = getResources().getStringArray(R.array.Miscellaneous_Patterns);

        for(int i=0; i<patternModelsNames.length;i++){
            patternModels.add(new PatternModel(patternModelsNames[i],
                    patternImages[i],
                    sourceCode[i],
                    videoIcon[i],
                    Output[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this,SourceCodeActivity.class);
        intent.putExtra("Output",patternModels.get(position).getOutput());
        intent.putExtra("Source Code",patternModels.get(position).getSourceCode());
        intent.putExtra("Video Icon",patternModels.get(position).getIcon());
        startActivity(intent);
    }
}