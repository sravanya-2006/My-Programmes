#copyfile() = copies contents of a file
# copy() = copyfile() + permission mode + destination can be a directory 
# copy2() = copy() + copies metadata (file's creation and modification times)

import shutil

shutil.copyfile('test.txt','copy.txt') 
#within function there are 2 arguments 
#source, test

#arguments are same for every copy functions

