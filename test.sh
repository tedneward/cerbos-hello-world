#!/bin/sh

docker run -i -v $(pwd)/policies:/policies -t ghcr.io/cerbos/cerbos:0.24.0  compile ./policies
