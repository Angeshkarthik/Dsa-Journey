#include<stdio.h>
#include<string.h>
int ismirror(char ch){
    if(ch=='b')return 'd';
    else if(ch=='d')return 'b';
    else if(ch=='p')return 'q';
    else if(ch=='x')return 'x';
    else if(ch=='o')return 'o';
    else if(ch=='v')return 'v';
    else if(ch=='w')return 'w';
    else return '#';
}
int getmirror(char str[]){
    int len=strlen(str);
    for(int i=0;i<len;i++){
        if(ismirror(str[i])!=str[len-1-i]){
            return 0;
        }
    }
    return 1;
}
int main(){
    char str[100];
    fgets(str,100,stdin);
    str[strcspn(str,"\n")]='\0';
    char word[20][20];
    int row=0,col=0;
    for(int i=0;;i++){
        if(str[i]==' '||str[i]=='\0'){
            if(col>0){
                word[row][col]='\0';
                row++;
                col=0;
            }
        }
        if(str[i]=='\0')break;
            else if(str[i]!=' '){
                word[row][col]=str[i];
                col++;
            }
        }
    printf("[");
    int flag=1;
    for(int i=0;i<row;i++){
        if(getmirror(word[i])){
            if(flag==0)
                printf(",");
            printf("\"%s\"",word[i]);
            flag=0;
    }
}
    printf("]"); 
}