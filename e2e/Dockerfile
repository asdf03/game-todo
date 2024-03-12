FROM openjdk:11

RUN apt-get update && \
    apt-get install -y curl maven && \
    apt-get install -y wget unzip && \
    wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && \
    apt install -y ./google-chrome-stable_current_amd64.deb && \
    rm google-chrome-stable_current_amd64.deb

ARG CHROME_DRIVER_VERSION=100.0.4896.60
RUN wget -q --continue -P /chromedriver "http://chromedriver.storage.googleapis.com/$CHROME_DRIVER_VERSION/chromedriver_linux64.zip" && \
    unzip /chromedriver/chromedriver* -d /usr/local/bin/ && \
    rm /chromedriver/chromedriver_linux64.zip

ENV PATH=$PATH:/usr/local/bin/chromedriver

RUN curl -SsL https://downloads.gauge.org/stable | sh && \
    gauge install java && \
    gauge install html-report && \
    gauge install screenshot

WORKDIR /e2e

COPY . .

RUN mvn install -DskioTests

CMD ["gauge", "run", "specs"]
