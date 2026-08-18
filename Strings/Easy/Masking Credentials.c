#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
  char str[100];
  fgets(str,100,stdin);
  str[strcspn(str,"\n")]='\0';
  for(int i=0;str[i]!='\0';i++){
    if(isalpha(str[i])){
      for(int x=1;str[x]!='@';x++){
        str[x]='*';
      }
    }
  }
  for(int i=0;str[i]!='\0';i++){
    if(isdigit(str[i])){
      for(int x=0;x<14;x++){
        if(isdigit(str[x])){
          str[x]='*';
        }
      }
    }
  }
  printf("%s",str);
}