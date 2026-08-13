#include<stdio.h>
#include<string.h>
int main(){
    char str1[100], str2[100];  
    fgets(str1,100,stdin);
    fgets(str2,100,stdin);
    str1[strcspn(str1,"\n")]=0; 
    str2[strcspn(str2,"\n")]=0;
    int freq[256]={0};
    for(int i=0;str1[i]!='\0';i++){
        freq[str1[i]]++;
    }
    for(int i=0;str2[i]!='\0';i++){
        freq[str2[i]]--;
    }
    int flag=1;
    for(int i=0;i<256;i++){
        if(freq[i]!=0){
            flag=0;;
        }
    }
    if(flag){
        printf("Anagrams");
    }
    else{
        printf("Not Anagrams");
    }
    return 0;
}