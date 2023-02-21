#!/bin/sh

docker run --rm --name cerbos -i -t -v $(pwd)/policies:/policies -p 3592:3592 ghcr.io/cerbos/cerbos:latest $*
