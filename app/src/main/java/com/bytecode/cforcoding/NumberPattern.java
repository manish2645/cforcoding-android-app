package com.bytecode.cforcoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class NumberPattern extends AppCompatActivity implements  RecyclerViewInterface{

    ArrayList<PatternModel> patternModels = new ArrayList<>();
    int[] patternImages = {R.drawable.num1,R.drawable.num2,R.drawable.num3,R.drawable.num4,R.drawable.num5,
            R.drawable.num6,R.drawable.num7,R.drawable.num8,R.drawable.num9,R.drawable.num10,R.drawable.num11,
            R.drawable.num12,R.drawable.num13,R.drawable.num15,R.drawable.num16,R.drawable.num17,R.drawable.num18,
            R.drawable.num19,R.drawable.num20,R.drawable.num21,R.drawable.num22,R.drawable.num23,R.drawable.num24,
            R.drawable.num25};
    int[] Output = {R.drawable.num1,R.drawable.num2,R.drawable.num3,R.drawable.num4,R.drawable.num5,
            R.drawable.num6,R.drawable.num7,R.drawable.num8,R.drawable.num9,R.drawable.num10,R.drawable.num11,
            R.drawable.num12,R.drawable.num13,R.drawable.num15,R.drawable.num16,R.drawable.num17,R.drawable.num18,
            R.drawable.num19,R.drawable.num20,R.drawable.num21,R.drawable.num22,R.drawable.num23,R.drawable.num24,
            R.drawable.num25};
    int[] videoIcon = {R.drawable.num1,R.drawable.num2,R.drawable.num3,R.drawable.num4,R.drawable.num5,
            R.drawable.num6,R.drawable.num7,R.drawable.num8,R.drawable.num9,R.drawable.num10,R.drawable.num11,
            R.drawable.num12,R.drawable.num13,R.drawable.num15,R.drawable.num16,R.drawable.num17,R.drawable.num18,
            R.drawable.num19,R.drawable.num20,R.drawable.num21,R.drawable.num22,R.drawable.num23,R.drawable.num24,
            R.drawable.num25};
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
            "\t\t\tprintf(\"%2c\",'1');\n" +
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
            "\t\t\tprintf(\"%2d\",i);\n" +
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
            "\t\t\tprintf(\"%2d\",j);\n" +
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
            "\t\t\tprintf(\"%4d\",i*j);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*5*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint k=1;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tprintf(\"%4d\",k++);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*6*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint k=0;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tprintf(\"%4d\",k+=2);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*7*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=5;i>=1;i--)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tprintf(\"%2d\",i);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*8*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "int main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=5;j>=1;j--)\n" +
            "\t\t\tprintf(\"%2d\",j);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*9*/
                    "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tint k=-1;\n" +
                    "\tfor(i=1;i<=5;i++)\n" +
                    "\t{\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=1;j<=5;j++)\n" +
                    "\t\t\tprintf(\"%4d\",k+=2);\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*10*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint k=1;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t{\n" +
            "\t\t\tif(i%2 != 0)\n" +
            "\t\t\t\tprintf(\"%2d\",j);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",5-j+1);\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*11*/
             "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x=1;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t{\n" +
            "\n" +
            "\t\t\tif(i%2!=0)\n" +
            "\t\t\t\tprintf(\"%4d\",x++);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%4d\",--x);\n" +
            "\t\t}\n" +
            "\t\tx+=5;\n" +
            "\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*12*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif(i==j)\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",0);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*13*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "#include<math.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tprintf(\"%2d\", abs(i-j));\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}\n",
            /*15*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif((i==j) || (i+j)==6)\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",0);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*16*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif(i==1 || i==5 || j==1 || j==5)\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",0);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*16*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif(i==1 || i==5 || i==j || j==1 || j==5 || (i+j)==6)\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",0);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*17*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif(((i+j)%2)==0)\n" +
            "\t\t\t\tprintf(\"%2d\",0);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*18*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=i;j++)\n" +
            "\t\t\tif((j%2)==0)\n" +
            "\t\t\t\tprintf(\"%2c\",' ');\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%2d\",i);\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*19*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint n=5;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=n;i++)\n" +
            "\t{\n" +
            "\t\tint x=i;\n" +
            "\t\tint y=n-i+1;\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=n;j++)\n" +
            "\t\t{\n" +
            "\t\t\tif(j%2==0)\n" +
            "\t\t\t\tprintf(\"%4d\",x);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%4d\",y);\n" +
            "\n" +
            "\t\tx=x+n;\n" +
            "\t\ty=y+n;\n" +
            "\t}\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*20*/
    "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint n=5;\n" +
            "\tint i,j;\n" +
            "\tfor(i=1;i<=n;i++)\n" +
            "\t{\n" +
            "\t\tint x=i,y=n-i+1;\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=n;j++)\n" +
            "\t\t{\n" +
            "\t\t\tif(j%2==1)\n" +
            "\t\t\t\tprintf(\"%4d\",x);\n" +
            "\t\t\telse\n" +
            "\t\t\t\tprintf(\"%4d\",y);\n" +
            "\t\t\tx=x+n;\n" +
            "\t\t\ty=y+n;\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}\n" +
            "\n",
            /*21*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tint x;\n" +
                    "\tfor(i=5;i>=1;i--)\n" +
                    "\t{\n" +
                    "\t\tx=i;\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=1;j<=5;j++)\n" +
                    "\t\t{\n" +
                    "\t\t\tprintf(\"%4d\",x);\n" +
                    "\t\t\tx=x+5;\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*22*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;\n" +
            "\tint x;\n" +
            "\tfor(i=5;i>=1;i--)\n" +
            "\t{\n" +
            "\t\tx=i;\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t{\n" +
            "\t\t\tprintf(\"%4d\",x);\n" +
            "\t\t\tx=x+5;\n" +
            "\t\t}\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}",
            /*23*/
            "#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "\tint i,j;\n" +
                    "\tint x;\n" +
                    "\tfor(i=5;i>=1;i--)\n" +
                    "\t{\n" +
                    "\t\tx=i;\n" +
                    "\t\tprintf(\"\\n\");\n" +
                    "\t\tfor(j=1;j<=5;j++)\n" +
                    "\t\t{\n" +
                    "\t\t\tprintf(\"%4d\",x);\n" +
                    "\t\t\tx=x+5;\n" +
                    "\t\t}\n" +
                    "\t}\n" +
                    "\tgetch();\n" +
                    "}",
            /*24*/
            "#include<stdio.h>\n" +
            "#include<conio.h>\n" +
            "void main()\n" +
            "{\n" +
            "\tint i,j;" +
            "int x;\n" +
            "\tclrscr();\n" +
            "\tfor(i=1;i<=5;i++)\n" +
            "\t{\n" +
            "\t\tx=5;\n" +
            "\t\tprintf(\"\\n\");\n" +
            "\t\tfor(j=1;j<=5;j++)\n" +
            "\t\t\tif(i>j)\n" +
            "\t\t\t\tprintf(\"%2d\",1);\n" +
            "\t\t\telse\n" +
            "\t\t\t{\n" +
            "\t\t\t\tprintf(\"%2d\",x);\n" +
            "\t\t\t\tx--;\n" +
            "\t\t\t}\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t}\n" +
            "\tgetch();\n" +
            "}"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_pattern);

        getSupportActionBar().setTitle("Number Pattern Programs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setPatternModels();
        NumberAdapter adapter = new NumberAdapter(this,patternModels,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void setPatternModels(){
        String[] patternModelsNames = getResources().getStringArray(R.array.Number_Patterns);

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
        //Toast.makeText(this,"You Cliked",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,SourceCodeActivity.class);
        intent.putExtra("Output",patternModels.get(position).getImage());
        intent.putExtra("Source Code",patternModels.get(position).getSourceCode());
        intent.putExtra("Video Icon",patternModels.get(position).getIcon());
        startActivity(intent);
    }
}