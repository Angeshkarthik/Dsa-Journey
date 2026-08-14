#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    fgets(str,100,stdin);
    str[strcspn(str,"\n")]=0;
    char stack[100];
    int top=-1;
    int flag=1;
    for(int i=0;str[i]!='\0';i++){
      if(str[i]=='('||str[i]=='['||str[i]=='{'){
        stack[++top]=str[i];
      }
      else if(str[i]==')'||str[i]==']'||str[i]=='}'){
        if(top==-1){
            flag=0;
            break;
        }
        if((str[i]==')' && stack[top]!='(')||
            (str[i]==']' && stack[top]!='[')||
            (str[i]=='}' && stack[top]!='{')){
                flag=0;
                break;
            }
            top--;
      }
    }
    if(flag)printf("Balanced");
    else printf("Not Balanced");

    return 0;
}
