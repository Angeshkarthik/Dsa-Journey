#include<stdio.h>
#include<string.h>
int main(){
  char str[100];
  fgets(str,100,stdin);
  str[strcspn(str,"\n")]='\0';
  char stack[100];
  int top=-1;
  int flag=1;
  for(int i=0;str[i]!='\0';i++){
    char c = str[i];
    if(c=='('||c=='['||c=='{'){
      stack[++top]=str[i];
    }
    else if(c==')'||c==']'||c=='}'){
        if(top==-1){
          flag=0;
          break;
        }
        else if((c==')'&&stack[top]!='(')
              ||(c==']'&&stack[top]!='[')
              ||(c=='}'&&stack[top]!='{')){
                flag=0;
                break;
              }
        top--;
      }
    }
    if(top!=-1)flag=0;
    if(flag)printf("valid");
    else printf("Not valid");
}