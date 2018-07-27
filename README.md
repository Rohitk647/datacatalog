# Jmeter-test
----

##Description

A sample apiproxy that can be deployed to apigee edge and parameterized Jmeter test that takes in different varaibles and generate a result file in specified location

----

###Pre-reqs

* Download Jmeter
*** Apache-Jmeter 4.0***
[Jmeter 4.0](https://jmeter.apache.org/download_jmeter.cgi)
 
* Create the required environment variables on your local machine
```
JMETER_HOME=~/apache-jmeter-4.0
export PATH=$PATH:~/apache-jmeter-4.0/bin
```
* Apigee Edge Trial Account

###Uploading the Proxy

**edge folder has the sample apiproxy that can be uploaded to apigee**

Steps to upload the proxy

1. Zip the apiproxy in the edge folder
2. Create a new apiproxy on apigee edge of type proxy bundle
3. Upload Zip bundle to apigee

      ![Proxy Bundle](images/proxy.PNG | width=50)
4. Provide the zip folder to deploy the proxy

      ![Upload Bundle](images/upload.PNG | width=50)

###Running the Test

``` 
jmeter -n -t <path to .jmx file> -Jthreads=<number of threads> -Jloop=<number of times> -Jramp=<interval between requests> -JdataFile=<path to uris.txt> -Jserver=<apigee host name> -Jprotocol=<http or https> -l <name of the results file>
```

**If we are using opdk replace the server name with the vhost alias**

###Parameters to be Provided

```
-t <path to .jmx file>: Provide the test file that has your Jmeter test cases
-Jthreads: number of users
-Jramp: interval in seconds 
-Jloop: number of times you want to send the request
-Jserver: Host name of your API
-JdataFile: File that contains the uri paths for the give server
-Jprotocol: http or https
-l file name: name of the file you want to save your jmeter results to
```


###Resources file(In-detail):
**uris.txt** file holds all the paths for the given server name using which we can send the requests also include the basepath to make sure we are sending request to the correct proxy


###Sample Request

```
jmeter -n -t src/test/test.jmx -Jthreads=5 -Jloop=2 -Jramp=1 -JdataFile=src/test/uris.txt -Jserver=<orgname>.<envname>.apigee.net -Jprotocol=<http or https> -l results.txt 
```
The above command will send 5 requests in a second for two times to the server by appending resource path found in the uris.txt file

###END
