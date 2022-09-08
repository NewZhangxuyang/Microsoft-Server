# Dockerfile
# 基于的镜像
FROM openjdk:8-jdk-alpine

VOLUME /opt/tmp

# 作者
MAINTAINER zhangxuyang

# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp

# 将jar包添加到容器
ADD target/user-service-1.0.jar  user-service.jar

# -Djava.security.egd=file:/dev/./urandom 可解决tomcat可能启动慢的问题
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user-service.jar"]
# 对外端口
EXPOSE 8083