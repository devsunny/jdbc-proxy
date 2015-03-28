#!/usr/bin/env perl

#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements. See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership. The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License. You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied. See the License for the
# specific language governing permissions and limitations
# under the License.
#
use strict;
use warnings;

use lib './lib';

use Thrift;
use Thrift::BinaryProtocol;
use Thrift::Socket;
use Thrift::BufferedTransport;
use Thrift::FramedTransport;


use jdbc::proxy::JdbcProxy;
use jdbc::proxy::Types;
use jdbc::proxy::Constants;


use Data::Dumper;

my $socket    = new Thrift::Socket('localhost',9090);
my $transport = new Thrift::FramedTransport($socket);
my $protocol  = new Thrift::BinaryProtocol($transport);
my $client    = new jdbc::proxy::JdbcProxyClient($protocol);


eval{
    $transport->open();

    my $st = $client->ping();
    print "$st\n";
	my @params = ();
	
	my $mparam = new jdbc::proxy::JPMethodParameter();
	$mparam->type(1);
	$mparam->value("This is string");
	$params[0] = $mparam;
	my @ret = $client->executeOsCommand(\@params);
	my $rowid = 0;
	foreach (@ret) {
		foreach (@$_) {		 
		  ++$rowid;
		  print "ROWID-$rowid: ";
		  foreach (@$_) {
			print " $_";
		  }
		  print " \n";
		}
	}	
    $transport->close();
	
}; if($@){
    warn(Dumper($@));
}
