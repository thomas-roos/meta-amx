#!/bin/sh
name="LCMSampleApp"

case $1 in
    start|boot)
        if [ -s /var/run/${name}.pid ] && [ -d "/proc/$(cat /var/run/${name}.pid)/fdinfo" ]; then
           echo "${name}is already started"
           exit 0
        fi
        ${name} -D
        ;;
    stop|shutdown)
        if [ -f /var/run/${name}.pid ]; then
            kill `cat /var/run/${name}.pid`
        else
            killall ${name}
        fi
        ;;
    debuginfo)
        ubus-cli "LCMSampleApp.?"
        ;;
    restart)
        $0 stop
        $0 start
        ;;
    log)
        echo "TODO log LCMSampleApp client"
        ;;
    *)
        echo "Usage : $0 [start|boot|stop|debuginfo|log]"
        ;;
esac
