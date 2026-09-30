char* reverseWords(char* str) {
    char word[1000][1000];
    int row=0,col=0;
    for(int i=0;;i++){
        if(str[i]==' '||str[i]=='\0'){
            if(col>0){
            word[row][col]='\0';
            row++;
            col=0;
            }
            if(str[i]=='\0')break;
        }
        else{
            word[row][col]=str[i];
            col++;
        }
    }
    char *ans = (char *)malloc(10001);
    int k=0;
    for(int i=row-1;i>=0;i--){
        for(int j=0;word[i][j]!='\0';j++){
            ans[k++]=word[i][j];
        }
        if(i>0)ans[k++]=' ';
    }
    ans[k]='\0';
    return ans;
}
