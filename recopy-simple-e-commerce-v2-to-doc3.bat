set "doc3-simple-e-commerce-v2=..\..\doc3\3-learn\33-coding\337-mytool-demo-snippet-code\simple-e-commerce-v2"
cd ..
rd /S /Q %doc3-simple-e-commerce-v2%\
robocopy doc3-simple-e-commerce-v2 %doc3-simple-e-commerce-v2%\ /E /MIR /Z /XD "not-copy" "upload-folder" "log" ".git" ".gitattributes" ".mvn"
echo 'Copy current doc3-simple-e-commerce-v2 to doc3\3-learn\33-coding\337-mytool-demo-snippet-code\simple-e-commerce-v2 done!'
