*Step 1* -- Building the docker image. Go to _decking/dockerbase_, then issue
```
docker build -t thomas/models15 .
```
*Step 2* -- Getting the `redis` image
```
docker pull resid
```
*Step 3* -- Creating the `main` cluster with decking
```
decking create main
```
*Step 4* -- Running the `main` cluster with decking
```
decking start main
```
*Step 5* -- Cleaning up
```
decking destroy main
```
