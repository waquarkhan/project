vim dockerfile

FROM ubuntu
MAINTAINER logiclabs

RUN apt-get update && apt-get install -y git tree

:wq