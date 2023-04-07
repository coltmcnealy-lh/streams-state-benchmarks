#!/bin/bash

docker compose down
rm -r /tmp/kafkaState
docker compose up -d
