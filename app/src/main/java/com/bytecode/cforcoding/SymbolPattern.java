package com.bytecode.cforcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SymbolPattern extends AppCompatActivity implements RecyclerViewInterface{

    ArrayList<PatternModel> patternModels = new ArrayList<>();
    int[] videoIcon = {R.drawable.starp1,R.drawable.starp2,R.drawable.starp3,R.drawable.starp4,R.drawable.starp5,
            R.drawable.starp6,R.drawable.starp7,R.drawable.star8,R.drawable.star9,R.drawable.star10,R.drawable.star11,R.drawable.star12
            ,R.drawable.star13,R.drawable.star14,R.drawable.star15,R.drawable.star16,R.drawable.star17,R.drawable.star18,R.drawable.star19,R.drawable.star20};
    int[] patternImages = {R.drawable.starp1,R.drawable.starp2,R.drawable.starp3,R.drawable.starp4,R.drawable.starp5,
            R.drawable.starp6,R.drawable.starp7,R.drawable.star8,R.drawable.star9,R.drawable.star10,R.drawable.star11,R.drawable.star12
            ,R.drawable.star13,R.drawable.star14,R.drawable.star15,R.drawable.star16,R.drawable.star17,R.drawable.star18,R.drawable.star19,R.drawable.star20};
    int[] Output = {R.drawable.starp1,R.drawable.starp2,R.drawable.starp3,R.drawable.starp4,R.drawable.starp5,
            R.drawable.starp6,R.drawable.starp7,R.drawable.star8,R.drawable.star9,R.drawable.star10,R.drawable.star11,R.drawable.star12
            ,R.drawable.star13,R.drawable.star14,R.drawable.star15,R.drawable.star16,R.drawable.star17,R.drawable.star18,R.drawable.star19,R.drawable.star20};
    String[] sourceCode = {
            /*1*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*2*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(i==1 || i==5 ||j==1 ||j==5)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*3*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(i>=j) //or i+j <=\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*4*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(i==j || j==1 || i==5)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*5*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif((i+j)>=6)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*6*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif((i+j)==6 ||j==5 || i==5)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*7*/
             "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(j>=i)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*8*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(i==1 || j==5 || i==j)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*9*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif((i+j)<=6)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*10*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\tif(i==1 || j==1 || (i+j)==6)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*11*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\n" +
            "\tint i,j;\n" +
            "\tint x=5,y=5;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=9;j++)\n" +
            "\t\tif(j>=x && j<=y)   " +
            "//combine to patterns to create the given pattern\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tx--;\n" +
            "\t\ty++;\n" +
            "\t}\n" +
            "       getch();\n" +
            "}",
            /*12*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=5,y=5;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=9;j++)\n" +
            "\t\tif(j==x || j==y || i==5)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t       x--;\n" +
            "\t       y++;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*13*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "int main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=1;\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=x;j++)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\tif(i<=7/2)\n" +
            "\t\t\tx++;\n" +
            "\t\telse\n" +
            "\t\t\tx--;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*14*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "int main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=1;\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=x;j++)\n" +
            "\n" +
            "\t\t\tif(j==1 || j==x)\n" +
            "\t\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\t\tif(i<=7/2)\n" +
            "\t\t\t\tx++;\n" +
            "\t\t\telse\n" +
            "\t\t\t\tx--;\n" +
            "\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*15*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=4;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=4;j++)\n" +
            "\t\tif(j>=x)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tif(i<=7/2)\n" +
            "\t\t\tx--;\n" +
            "\t\telse\n" +
            "\t\t\tx++;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*16*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=4;\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=4;j++)\n" +
            "\t\tif(j==x || j==4)\n" +
            "\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\telse\n" +
            "\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tif(i<=3)\n" +
            "\t\t\tx--;\n" +
            "\t\telse\n" +
            "\t\t\tx++;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*17*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint x=1;\n" +
            "\tint y=9;\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=9;j++)\n" +
            "\t\t\tif(j>=x && j<=y)\n" +
            "\t\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tx++;\n" +
            "\t\ty--;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*18*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint x=1;\n" +
            "\tint y=9;\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=9;j++)\n" +
            "\t\t\tif(j==x || j==y || i==1)\n" +
            "\t\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tx++;\n" +
            "\t\ty--;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*19*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint x=1;\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=x;j++)\n" +
            "\t\t\tif(j==x)\n" +
            "\t\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tif(i<=3)\n" +
            "\t\t\tx++;\n" +
            "\t\telse\n" +
            "\t\t\tx--;\n" +
            "\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
    /*20*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint x=4;\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=7;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=x;j++)\n" +
            "\t\t\tif(j==x)\n" +
            "\t\t\t\tprintf(\"%2c\",'*');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\tif(i<=3)\n" +
            "\t\t\tx--;\n" +
            "\t\telse\n" +
            "\t\t\tx++;\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symbol_pattern);

        getSupportActionBar().setTitle("Symbol Pattern Programs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setPatternModels();
        NumberAdapter adapter = new NumberAdapter(this,patternModels,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
    private void setPatternModels(){
        String[] patternModelsNames = getResources().getStringArray(R.array.Symbol_Patterns);

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