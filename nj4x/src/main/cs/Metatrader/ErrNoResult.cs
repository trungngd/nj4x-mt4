// Copyright (c) 2008-2014 by Gerasimenko Roman
// 
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 
// 1. Redistribution of source code must retain the above copyright
//     notice, this list of conditions and the following disclaimer.
// 
// 2. Redistribution in binary form must reproduce the above copyright
//     notice, this list of conditions and the following disclaimer in
//     the documentation and/or other materials provided with the
//     distribution.
// 
// 3. The name "NJ4X" must not be used to endorse or promote
//     products derived from this software without prior written
//     permission.
//     For written permission, please contact roman.gerasimenko@nj4x.com
// 
// 4. Products derived from this software may not be called "NJ4X",
//     nor may "NJ4X" appear in their name, without prior written
//     permission of Gerasimenko Roman.
// 
// THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
// OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED.  IN NO EVENT SHALL THE JFX CONTRIBUTORS
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
// USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
// OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
// OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE.

using System;

namespace nj4x.Metatrader
{
    /// <summary>OrderModify attempts to replace the values already set with the same values</summary>
    /// <remarks>One or more values must be changed, then modification attempt can be repeated.</remarks>
    [Serializable] //
    public class ErrNoResult : MT4Exception
    {
        internal ErrNoResult(string message)
            : base(1, message + " -> OrderModify attempts to replace the values already set with the same values")
        {
        }
    }
}