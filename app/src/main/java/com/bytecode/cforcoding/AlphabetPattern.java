package com.bytecode.cforcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class AlphabetPattern extends AppCompatActivity implements RecyclerViewInterface{

    ArrayList<PatternModel> patternModels = new ArrayList<>();
    int[] patternImages = {R.drawable.apat,R.drawable.bpat,R.drawable.cpat,R.drawable.dpat,R.drawable.epat,R.drawable.fpat,R.drawable.gpat,R.drawable.hpat,
            R.drawable.ipat,R.drawable.jpat,R.drawable.kpat,R.drawable.lpat,R.drawable.mpat,R.drawable.npat,R.drawable.opat,R.drawable.ppat,R.drawable.qpat,
            R.drawable.rpat,R.drawable.spat,R.drawable.tpat,R.drawable.upat,R.drawable.vpat,R.drawable.wpat,R.drawable.xpat,R.drawable.ypat,R.drawable.zpat};
    int[] Output = {R.drawable.apat,R.drawable.bpat,R.drawable.cpat,R.drawable.dpat,R.drawable.epat,R.drawable.fpat,R.drawable.gpat,R.drawable.hpat,
            R.drawable.ipat,R.drawable.jpat,R.drawable.kpat,R.drawable.lpat,R.drawable.mpat,R.drawable.npat,R.drawable.opat,R.drawable.ppat,R.drawable.qpat,
            R.drawable.rpat,R.drawable.spat,R.drawable.tpat,R.drawable.upat,R.drawable.vpat,R.drawable.wpat,R.drawable.xpat,R.drawable.ypat,R.drawable.zpat};
    int[] videoIcon = {R.drawable.apat,R.drawable.bpat,R.drawable.cpat,R.drawable.dpat,R.drawable.epat,R.drawable.fpat,R.drawable.gpat,R.drawable.hpat,
            R.drawable.ipat,R.drawable.jpat,R.drawable.kpat,R.drawable.lpat,R.drawable.mpat,R.drawable.npat,R.drawable.opat,R.drawable.ppat,R.drawable.qpat,
            R.drawable.rpat,R.drawable.spat,R.drawable.tpat,R.drawable.upat,R.drawable.vpat,R.drawable.wpat,R.drawable.xpat,R.drawable.ypat,R.drawable.zpat};
    String[] sourceCode = {
            /*A*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<7;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\t\tif((i==2 &&(j<=4 && j>=1)) || (i+j)==3 || (j-i)==3)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*B*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<7;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\t\tif(j==0 || (i==0 && (i+j)<=5) || " +
                    "       (i==6 && (i+j)<=11) || (i==3 && (i+j)<=8) " +
                    "       || (j==6 && (i==1 || i==2 || i==4 || i==5)))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*C*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<6;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<4;j++)\n" +
                    "\t\t\tif((i==0 &&(i+j>0)) || (i==5 &&(i+j>5)) " +
                    "       || (j==0 &&(i+j>0) && (i+j<5)))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*D*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<4;j++)\n" +
                    "\t\tif(j==0 || (i==0 && i+j<=2) || (i==4 && i+j<=6) " +
                    "       || j==3 && (i+j)>3 && i+j<=6)\n" +
                    "\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\telse\n" +
                    "\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*E*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<7;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\t\tif(i==0 || i==6 || j==0 || i==3)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*F*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<7;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\tif(i==0 || j==0 || i==3)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*G*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<6;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<4;j++)\n" +
                    "\t\t\tif((i==0 &&(i+j>0)) || (i==5 &&(i+j>5)) || " +
                    "       (j==0 &&(i+j>0) && (i+j<5)) || (j==3 && i>=3))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*H*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 || j==4 || i==2)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*I*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(i==0 || i==4 || j==2)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*J*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(i==0 || j==2 || (i==4 && j<=2) || (i==3 && j==0))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*K*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<=6;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<=5;j++)\n" +
                    "\t\t\tif(j==0 || (i+j==4) || ((i>=3) && (i-j)==2))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*L*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 ||i==4)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*M*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 || j==4 || (i<=2 && ((i+j)==4 ||(i==j))))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*N*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 || j==4 || i==j)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*O*/
            "// O Pattern\n" +
                    "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 || j==4 || i==0 || i==4)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "\n" +
                    "}",
            /*P*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(j==0 || (i==1 && j==3) || " +
                    "       (i==0 && i+j<=2) || (i==2 && i+j<=4))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*Q*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<6;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<6;j++)\n" +
                    "\t\t\tif( (i<=4 && j<=4) && (i==0 || j==0 " +
                    "           || i==4 || j==4 ||(i>=2 && i==j)))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tprintf(\"*\");\n" +
                    "\tgetch();\n" +
                    "}",
            /*R*/
            "// R Pattern\n" +
                    "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<7;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\t\tif(((i==j) && (i+j)>=8) || (j==0)\n " +
                    "|| (i==0 && i+j<4) || (i==3 && i+j<7) ||\n " +
                    "(j==4 && i==1) || (j==4 && i==2))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*S*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(i==0 || i==4 || i==2 ||(j==0 && i<=2) || (j==4 && i>=2))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*T*/
            "// T Pattern\n" +
                    "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(i==0 || j==2)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*U*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(((j==0) && (i+j<=3)) || (j==4 &&(i+j<=7)) || " +
                    "           (i==4 && (i+j)%2!=0)|| (i==4 && j==2))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*V*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<4;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<7;j++)\n" +
                    "\t\t\tif((i==j) || ((i+j)==6))\n" +
                    "\t\t\t\tprintf(\"%c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%c\",' ');\n" +
                    "\t}\n" +
                    "\n" +
                    "\tgetch();\n" +
                    "}",
            /*W*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<=5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<=5;j++)\n" +
                    "\t\t\tif(j==5 || j==0 || (i==j && (i+j)>=6) || " +
                    "           ((i+j==5) && (i>=3)))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\n" +
                    "\tgetch();\n" +
                    "}",
            /*X*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif((i==j) || ((i+j)==4))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\n" +
                    "\tgetch();\n" +
                    "}",
            /*Y*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif(((i==j) && i<3) || ((i+j)==4))\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\n" +
                    "\tgetch();\n" +
                    "}",
            /*Z*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tclrscr();\n" +
                    "\tfor(i=0;i<5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=0;j<5;j++)\n" +
                    "\t\t\tif((i+j)==4 || i==0 || i==4)\n" +
                    "\t\t\t\tprintf(\"%2c\",'*');\n" +
                    "\t\t\telse\n" +
                    "\t\t\t\tprintf(\"%2c\",' ');\n" +
                    "\t}\n" +
                    "\n" +
                    "\tgetch();\n" +
                    "}",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_pattern);

        getSupportActionBar().setTitle("Alphabet Pattern Programs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setPatternModels();
        NumberAdapter adapter = new NumberAdapter(this,patternModels, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setPatternModels(){
        String[] patternModelsNames = getResources().getStringArray(R.array.Alphabet_Patterns);

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