#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    fgets(str,100,stdin);
    str[strcspn(str,"\n")]=0;
    char ans[strlen(str)+1];
    int j=0;
    for(int i=0;str[i]!='\0';i++){
      char ch = tolower(str[i]);
      if(isalnum(ch)){
        ans[j++]=ch;
      }
    }
    ans[j]='\0';
    int flag=1;
    int left = 0;
    int right = strlen(ans)-1;
    while(left<right){
      if(ans[left]!=ans[right]){
        flag=0;
        break;
      }
      left++;
      right--;
    }
    if(flag)printf("Valid Palidrome");
    else printf("Not a Valid Plaindrome");
  }