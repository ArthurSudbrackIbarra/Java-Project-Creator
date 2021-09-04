#!/bin/bash

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"

java -jar $SCRIPT_DIR/jpc.jar $PWD $1 $2

JAVA_EXIT_CODE="${?}"

case $JAVA_EXIT_CODE in
    0)
        cd $1
        code .
        ;;
    1)
        cd $1
        ;;
    *)
        exit
        ;;
esac