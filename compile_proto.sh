#!/bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )

rm -r app/src/main/java/benchmark/speedb/proto/

protoc --grpc-java_out=${SCRIPT_DIR}/app/src/main/java/ --java_out=${SCRIPT_DIR}/app/src/main/java/ -I=$SCRIPT_DIR/ --experimental_allow_proto3_optional $SCRIPT_DIR/model.proto

