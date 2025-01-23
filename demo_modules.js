const myfs=require('fs')
myfs.readFile('myfile.txt','utf8',function(err,data)
{
    console.log(data)
})

//Writting to file
myfs.writeFile('newfile.txt','Its Deficult but intresting..',function(err){
    console.log('data Saved..')
})
 // for append
myfs.appendFile('newfile.txt','\n Need to Understand few more constructs',function(err){
    console.log('data Saved..')
})
//renaming file
myfs.rename('newfile.txt','renamedfile.txt',function(err){
    console.log('File renamed succesfully')
})

// for deleting file

myfs.unlink('myfile.txt',function(err){
    console.log("File deleted succefully")
})

