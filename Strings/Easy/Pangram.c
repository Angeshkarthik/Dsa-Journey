#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
  char str[100];
  fgets(str,100,stdin);
  str[strcspn(str,"\n")]=0;
  int freq[26]={0};
  for(int i=0;str[i]!='\0';i++){
    if(isalpha(str[i])){
      freq[tolower(str[i]-'a')]=1;
    }
  }
  int flag=1;
  for(int i=0;i<26;i++){
    if(freq[i]==0){
      flag=0;
      break;
    }
  }
  if(flag){
    printf("Is a Pangram");
  }else{
    printf("Not a Pangram");
  }
  return 0;
}