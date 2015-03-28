#!/usr/bin/env perl


use strict;
use warnings;

use lib './lib';

use Thrift;
use Thrift::BinaryProtocol;
use Thrift::Socket;
use Thrift::BufferedTransport;
use Thrift::FramedTransport;


use rpc::gateway::RpcGateway;
use rpc::gateway::Types;
use rpc::gateway::Constants;


use Data::Dumper;

my $socket    = new Thrift::Socket('localhost',22443);
my $transport = new Thrift::FramedTransport($socket);
my $protocol  = new Thrift::BinaryProtocol($transport);
my $client    = new rpc::gateway::RpcGatewayClient($protocol);


eval{
    $transport->open();

    my $st = $client->ping();
    print "$st\n";
	my @params = ();
	
	my $mparam = new rpc::gateway::JPValueObject();
	$mparam->type(1);
	$mparam->value("This is string");
	$params[0] = $mparam;
	my @ret = $client->executeComplexCommand(\@params);
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
