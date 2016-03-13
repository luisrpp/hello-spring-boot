FROM java:8
MAINTAINER Luis Roberto Pereira de Paula <luisrpp@gmail.com>

# Update apt-get sources AND install dependencies
RUN apt-get update && apt-get install -y git curl wget

# Install Maven
RUN mkdir -p /opt/maven
WORKDIR /opt/maven
RUN \
  wget http://ftp.unicamp.br/pub/apache/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz && \
  tar -xvzf apache-maven-3.3.9-bin.tar.gz && \
  rm apache-maven-3.3.9-bin.tar.gz

ENV M2_HOME /opt/maven/apache-maven-3.3.9
ENV PATH $M2_HOME/bin:$PATH

# Define working directory.
WORKDIR /data

# Getting Hello services app
RUN git clone https://github.com/luisrpp/hello-spring-boot.git
WORKDIR /data/hello-spring-boot
RUN mvn clean install package

# Define default command.
CMD ["bash"]
