#!/bin/sh

case $1 in
    start)
        python3 /usr/srv/lcmwebpython.py &
        ;;
    stop)
        killall -9 python3
        ;;
    restart)
        $0 stop
        $0 start
        ;;
    *)
        echo "Usage : $0 [start|stop]"
        ;;
esac